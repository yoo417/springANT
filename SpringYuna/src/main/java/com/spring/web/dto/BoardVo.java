package com.spring.web.dto;

public class BoardVo {
	
	int no;
	String title;
	String author;
	String content;
		
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
	    return "BoardVO [bno=" + no + ", title=" + title +  ", author=" + author+ ", content=" + content  + "]";
	}
	
	
}
