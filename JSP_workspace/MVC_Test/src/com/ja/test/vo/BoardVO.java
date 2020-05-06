package com.ja.test.vo;

public class BoardVO {
	private String BOARD_NO;
	private String MEMBER_NO;
	private String BOARD_TITLE;
	private String BOARD_CONTENT;
	private String BOARD_WRITEDATE;
	public BoardVO(String BOARD_NO, String MEMBER_NO, String BOARD_TITLE, String BOARD_CONTENT,
			String BOARD_WRITEDATE) {
		super();
		this.BOARD_NO = BOARD_NO;
		this.MEMBER_NO = MEMBER_NO;
		this.BOARD_TITLE = BOARD_TITLE;
		this.BOARD_CONTENT = BOARD_CONTENT;
		this.BOARD_WRITEDATE = BOARD_WRITEDATE;
	}
	public String getBOARD_NO() {
		return BOARD_NO;
	}
	public void setBOARD_NO(String BOARD_NO) {
		this.BOARD_NO = BOARD_NO;
	}
	public String getMEMBER_NO() {
		return MEMBER_NO;
	}
	public void setMEMBER_NO(String MEMBER_NO) {
		this.MEMBER_NO = MEMBER_NO;
	}
	public String getBOARD_TITLE() {
		return BOARD_TITLE;
	}
	public void setBOARD_TITLE(String BOARD_TITLE) {
		this.BOARD_TITLE = BOARD_TITLE;
	}
	public String getBOARD_CONTENT() {
		return BOARD_CONTENT;
	}
	public void setBOARD_CONTENT(String BOARD_CONTENT) {
		this.BOARD_CONTENT = BOARD_CONTENT;
	}
	public String getBOARD_WRITEDATE() {
		return BOARD_WRITEDATE;
	}
	public void setBOARD_WRITEDATE(String BOARD_WRITEDATE) {
		this.BOARD_WRITEDATE = BOARD_WRITEDATE;
	}

	
	
	
	
}
