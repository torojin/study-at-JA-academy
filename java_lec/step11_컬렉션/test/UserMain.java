package test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ID를 입력하세요 : pororo
 * PW를 입력하세요 : 1234
 * 
 * 뽀로로님이 입장하셨습니다.
 * 현재 포인트는 89.97점입니다
 * 
 * [[BOOK의 정보보기]]
 * 책이름 : java	책저자 : kim	책페이지 : 100
 * 책이름 : oracle책저자 : lee	책페이지 : 200
 * 책이름 : html	책저자 : shim	책페이지 : 300
 * 
 * ---------------------------------------
 * 
 * ID를 입력하세요 : pororo
 * PW를 입력하세요 : 1235
 * 
 * ID 또는 PW가 틀리거나 존재하지 않는 ID입니다.
 */
public class UserMain {

	public static void main(String[] args) {
		//입력할 수 있는 Scanner 생성
		Scanner sc=new Scanner(System.in);
		
		//메서드 안에서 동작하기 때문에 접근지정자가 필요없다
		String id, pw;
		
		//입력처리
		System.out.print("ID를 입력하세요 : ");
		id=sc.next();
		System.out.print("PW를 입력하세요 : ");
		pw=sc.next();
		
		//입력값에 대한 검사
		//UserProc에 대한 처리 / id,pw를 가지고 넘어간다.
		//UserProc Object 생성
		UserProc up=new UserProc();
		//UserProc에 대한 Method 생성 / User자료형에 entity 참조값에...
		User entity=up.getLoginUser(id,pw); // =new UserProc().getLoginUser(id,pw)
		
		//결과 출력
		if(entity !=null) {
			//데이터가 있는 경우
			System.out.println(entity.getName()+"님이 입장하셨습니다.");
			System.out.println("현재 포인트는 "+entity.getPoint()+"점 입니다.");
			
			//BookProc에서 for문 넘어오는 거 처리
			BookProc book=new BookProc();
			
			long start=System.currentTimeMillis();//메소드 시간 체크
			ArrayList<Book> list=book.getList(); //ArrayList<Book> getList() 리턴 받음
			long end=System.currentTimeMillis();//메소드 시간 체크
			
			System.out.println(end-start);//메소드 시간 체크
			System.out.println("[[BOOK의 정보보기]]");
			for(Book ob:list) {
				System.out.print("책이름 : "+ob.getTitle()+"\t");
				System.out.print("책저자 : "+ob.getAuthor()+"\t");
				System.out.print("페이지 : "+ob.getPage()+"\t");
			}
		}else {
			//데이터가 없는 경우
			System.out.println("ID 또는 PW가 틀리거나 존재하지 않는 ID입니다.");
		}
	}

}
