package com.ja.rubato.model;

import java.sql.*;
import java.util.*;
import java.util.Date;

import com.ja.rubato.vo.BoardVo;
import com.ja.rubato.vo.MemberVo;

public class MemberDao {
	//DB연동 정보
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "SCOTT";
	private static final String PASSWORD = "TIGER";
	
	//로그인 처리기능
	public MemberVo Login(String login_id, String login_pw){
		//memberVo 초기화?
		MemberVo memberVo = null;
		
		String query = "SELECT * FROM ROBATO_MEMBER WHERE M_ID = ? AND M_PW = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstm = conn.prepareStatement(query);
			pstm.setString(1, login_id);
			pstm.setString(2, login_pw);
			rs = pstm.executeQuery();
			
			//로직
			if(rs.next()) {
				int m_no = rs.getInt("m_no");
				String m_name = rs.getString("m_name");
				String m_id = rs.getString("m_id");
				String m_pw = rs.getString("m_pw");
				String m_nick = rs.getString("m_nick");
				String m_phone = rs.getString("m_phone");
				java.util.Date m_birth = rs.getDate("m_birth");
				java.util.Date m_joindate = rs.getDate("m_joindate");

				memberVo = new MemberVo(m_no, m_name, m_id, m_pw, m_nick, m_phone, m_birth, m_joindate);
				
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
		return memberVo;
	}
	
	//여기서 부터 다시 작업해야함
	public MemberVo VoDataJoin(int no) {
		MemberVo memberVo = null;
		
		String query="SELECT * FROM ROBATO_MEMBER WHERE M_NO= ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);
			
			rs = pstm.executeQuery();
			
			//로직
			//if는 한 행만 뽑는 것 while은 전체를 뽑아 오는 것
			//if는 조건이 들어가있을때 while는 전체 select해올때      
			
			if(rs.next()) {
				int m_no = rs.getInt("m_no");
				String m_name = rs.getString("m_name");
				String m_id = rs.getString("m_id");
				String m_pw = rs.getString("m_pw");
				String m_nick = rs.getString("m_nick");
				String m_phone = rs.getString("m_phone");
				java.util.Date m_birth = rs.getDate("m_birth");
				java.util.Date m_joindate = rs.getDate("m_joindate");
				
				memberVo = new MemberVo(m_no, m_name, m_id, m_pw, m_nick, m_phone, m_birth, m_joindate);
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
		return memberVo;
	}
	
	public MemberVo ViewByNo(int no) {
		MemberVo memberVo = null;
		
		String query = "SELECT * FROM ROBATO_BOARD WHERE B_NO= ? ";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, no);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				int m_no = rs.getInt("m_no");
				String m_name = rs.getString("m_name");
				String m_id = rs.getString("m_id");
				String m_pw = rs.getString("m_pw");
				String m_nick = rs.getString("m_nick");
				String m_phone = rs.getString("m_phone");
				Date m_birth = rs.getDate("m_birth");
				Date m_joindate = rs.getDate("m_joindate");
				
				memberVo = new MemberVo(m_no, m_name, m_id, m_pw, m_nick, m_phone, m_birth, m_joindate);
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
		return memberVo;
	}
	
}
