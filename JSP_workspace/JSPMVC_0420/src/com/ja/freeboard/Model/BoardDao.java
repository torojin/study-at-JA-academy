package com.ja.freeboard.Model;

import java.util.*;
import java.util.Date;
import java.sql.*;
import com.ja.freeboard.vo.*;

public class BoardDao {
	//DB연동 정보 / 멤버 변수로만듬
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; //필터 연동
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	
	//리턴타입 ArrayList<BoardVo>
	//게시판 내용 처리?
	//단순 데이터베이스 연동 코드
	public ArrayList<BoardVo> selectAll() {
		ArrayList<BoardVo> list = new ArrayList<BoardVo>();
		
		//''빼고 ? 넣어야함 / 값에만 ? 넣을 수 있다
		String query = "SELECT * FROM FB_BOARD ORDER BY BOARD_NO DESC";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		//select 할때는 ResultSet 필요
		ResultSet rs = null;
				
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 한번 로드
			conn = DriverManager.getConnection(URL, USER, PASSWORD); //데이터 베이스 접속
			pstm = conn.prepareStatement(query); //물음표가 들어간 쿼리를 컴파일함

			//SQL 실행시키는 API
			//리턴타입이 ResultSet이여서 rs에 넣어줌
			rs = pstm.executeQuery();
			
			//로직처리
			//반복 처리
			//re.next는 결과적으로 이 쿼리가 실행되면 rs객체에 담겨지고 ... 한줄씩 읽어온다?
			while(rs.next()) {
				int b_no = rs.getInt("BOARD_NO");
				int m_no = rs.getInt("MEMBER_NO");
				String b_title = rs.getString("BOARD_TITLE");
				String b_content = rs.getString("BOARD_CONTENT");
				java.util.Date b_writedate = rs.getDate("BOARD_WRITEDATE");
				
				BoardVo boardVo = new BoardVo(b_no,m_no,b_title,b_content,b_writedate); //데이터를 묶어서 출력
				list.add(boardVo);
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstm != null) {
				try {
					pstm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return list; //boardVo가 담긴 list를 리턴
	}
	
	//글 삭제 처리
	public void delete(int no) {
		String query="DELETE FROM FB_BOARD WHERE BOARD_NO = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //코드가 한번이라도 사용이 되야 사용가능하다
			conn = DriverManager.getConnection(URL, USER, PASSWORD); //데이터베이스 연동 프로토콜, TCP/IP를 잡아서 연동시켜줌
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);

			pstm.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstm != null) {
				try {
					pstm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	//글 수정 처리
	public void update(int no, String title, String content) {
		String query="UPDATE FB_BOARD SET BOARD_TITLE = ?, BOARD_CONTENT = ? WHERE BOARD_NO = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //코드가 한번이라도 사용이 되야 사용가능하다
			conn = DriverManager.getConnection(URL, USER, PASSWORD); //데이터베이스 연동 프로토콜, TCP/IP를 잡아서 연동시켜줌
			pstm = conn.prepareStatement(query);
			pstm.setString(1, title);
			pstm.setString(2, content);
			pstm.setInt(3, no);
			
			pstm.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstm != null) {
				try {
					pstm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	//글 생성 처리
	public void insert(int memberNo, String title, String content) {
		String query="INSERT INTO FB_BOARD VALUES (FB_BOARD_SEQ.NEXTVAL, ?, ?, ?,SYSDATE)";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //코드가 한번이라도 사용이 되야 사용가능하다
			conn = DriverManager.getConnection(URL, USER, PASSWORD); //데이터베이스 연동 프로토콜, TCP/IP를 잡아서 연동시켜줌
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, memberNo);
			pstm.setString(2, title);
			pstm.setString(3, content);

			pstm.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstm != null) {
				try {
					pstm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	//글 검색 처리
	public BoardVo selectByNo(int no) {
		BoardVo boardVo = null;
		
		String query = "SELECT * FROM FB_BOARD WHERE BOARD_NO = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;//select 할때는 ResultSet 필요
				
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 한번 로드
			conn = DriverManager.getConnection(URL, USER, PASSWORD); //데이터 베이스 접속
			pstm = conn.prepareStatement(query); //물음표가 들어간 쿼리를 컴파일함
			pstm.setInt(1, no);

			//SQL 실행시키는 API
			//리턴타입이 ResultSet이여서 rs에 넣어줌
			rs = pstm.executeQuery();
			
			//로직...
			if(rs.next()) {
				int b_no = rs.getInt("board_no");
				int m_no = rs.getInt("member_no");
				String b_title = rs.getString("board_title");
				String b_content = rs.getString("board_content");
				java.util.Date b_writedate = rs.getDate("board_writedate");
								
				//리턴타입 import java.util과 java.sql 주의 
				//java.sql이 java.util의 상속을 받고 있는거 주의할것
				boardVo = new BoardVo(b_no,m_no,b_title,b_content,b_writedate); //null값이 아닌 이것의 주소값이 넘어감
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(pstm != null) {
				try {
					pstm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		return boardVo;
	}
	
}



























