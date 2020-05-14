package com.ja.freeboard.board.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ja.freeboard.board.service.BoardServiceImpl;
import com.ja.freeboard.vo.BoardVo;
import com.ja.freeboard.vo.MemberVo;
import com.ja.freeboard.vo.UploadFileVo;
//여기가 핵심
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	//service 주입
	@Autowired
	private BoardServiceImpl boardService;
	
	@RequestMapping("/main_page.do")
	public String mainPage(Model model, String search_word, 
			@RequestParam(value = "currPage", required=false, defaultValue="1") int currPage) {//jsp 페이지에서 1값을 안받을 때 오류 발생 처리
		//기본타입일 경우 어노테이션을 붙여줘야함
		//required=false로 지정하면 해당 키값이 존재하지 않다고 해서 BadRequest가 발생하지 않게 됩니다.
        //그리고 존재하지 않다면 변수에 default로 1이 들어가게됩니다.
		
		//if(currPage <= 0) {
		//	currPage = 1;
		//}	
		
		List<Map<String,Object>> list =boardService.getBoardList(search_word, currPage);
		
		int totalCount = boardService.getBoardDataCount(search_word);
		
		//%5 + 1 * 5
			
		int beginPage = ((currPage-1)/5)*5 + 1;
		int endPage = ((currPage-1)/5+1)*5;
		
		if(endPage > ((totalCount-1)/10)+1) {
			endPage = ((totalCount-1)/10)+1;
		}
		
		
		model.addAttribute("beginPage", beginPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("currPage", currPage);		
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("dataList", list);
		return "board/main_page";
	}
	
	@RequestMapping("write_content_page.do")
	public String writeContentPage() {
		return "board/write_content_page";
	}
	
	//title과 content 받아옴
	@RequestMapping("write_content_process.do")
	public String writeContentProcess(MultipartFile [] upload_files, BoardVo boardVo, HttpSession session) {
		//!!주의!! MultipartFile는 파일 파라미터 명이랑 똑같아야함 / 배열형식으로 받아야한다
		
		//슬레쉬로 처리
		String uploadRootFolderName = "C:/uploadTest/";

		//파일 업로드 되는 폴더 자동 생성 처리
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("df Test:"+df);
		String todayFolder = df.format(today);
		
		String saveFolderName = uploadRootFolderName+todayFolder;
		
		File saveFolder = new File(saveFolderName);
		
		//파일 객체는 생성하는데 그 폴더가 있는지 없는지 확인
		if(!saveFolder.exists()) {
			//mkdirs 한번에 여러개 만들기..?
			saveFolder.mkdirs();
		}
		
		List<UploadFileVo> fileVoList = new ArrayList<UploadFileVo>();
				
		//파일 업로드 부분
		for(MultipartFile file : upload_files) {
			System.out.println("test : "+file.getOriginalFilename());
			System.out.println("test : "+file.getSize());
			//파일 선택 안했을 때 예외처리
			if(file.getSize() <= 0 ) {
				continue;
			}
			
			//랜덤 이름 짓기(중복 배제)
			//랜덤 + 시간 / 이쯤 되면 확률적으로 중복되지 않음
			//UUID 클래스 / 별로 의미없는 건데 램덤 사용해보려고 사용
			//유니크한 아이디를 만들겠다??
			
			String oriFileName = file.getOriginalFilename();
			
			String saveFileName = UUID.randomUUID().toString();
			saveFileName += "_"+System.currentTimeMillis();
			
			//확장자 명을 붙일것인가 말것인가
			//.jpg 붙여서 저장되게 처리
			saveFileName += oriFileName.substring(oriFileName.lastIndexOf("."));
						
			//???
			//String saveFileName = saveFolderName+"/"+file.getOriginalFilename();
			String saveRealPath = saveFolderName+"/"+saveFileName;
		
			System.out.println("saveFileName Test : "+saveRealPath);
			
			try {
				//string으로 못받고 File객체로 받아야 함
				file.transferTo(new File(saveRealPath));;
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			//DB를 위한 FileVo 객체 생성
			UploadFileVo fileVo = new UploadFileVo();
			
			//uploadTest는 빼고 그 이후부터의 나머지 링크
			//이 데이터들이 service쪽으로 넘어가야 한다
			fileVo.setFile_link_path(todayFolder + "/" + saveFileName);
			System.out.println("fileVo test : "+ fileVo);
			
			fileVo.setFile_real_path(saveRealPath);
			System.out.println("fileVo test : "+ fileVo);
			
			fileVoList.add(fileVo);
		}
		//데이터 처리
		
		MemberVo memberVo = (MemberVo)session.getAttribute("sessionUser");
		
		boardVo.setMember_no(memberVo.getMember_no());
		
		boardService.writeContent(boardVo, fileVoList);
		
		return"redirect:./main_page.do";
	}
	
	//글 읽기
	@RequestMapping("/read_content_page.do")
	public String readContentPage(int board_no, Model model) {
		
		Map<String,Object> map = boardService.getBoard(board_no);
		
		//model에 넣어줌?
		model.addAttribute("data",map); //page쪽에 $표시 이름
		
		return "board/read_content_page";
	}
	
	//글 삭제 처리
	@RequestMapping("/delete_content_process.do")
	public String deleteContentProcess(int board_no) {
		boardService.deleteContent(board_no);
		return "redirect:/board/main_page.do"; 
	}
	
	//글 수정 페이지
	@RequestMapping("/update_content_page.do")
	public String updateContentPage(int board_no, Model model) {
		model.addAttribute("data",boardService.getBoard(board_no));
		return "board/update_content_page";
	}
	
	//글 수정 기능
	@RequestMapping("/update_content_process.do")
	public String updateContentProcess(BoardVo boardVo) {
		boardService.updateContent(boardVo);
		return "redirect:/board/main_page.do";
	}
	
}
