package com.study.study_springboots.beans;

public class BoardBean_prac1 {
    private String title;
    private String content;
    private String userName;
    private String date;
    
    public BoardBean_prac1(){}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
    }
}
