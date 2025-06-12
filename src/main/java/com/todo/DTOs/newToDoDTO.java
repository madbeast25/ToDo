package com.todo.DTOs;

import java.time.LocalDate;

public class newToDoDTO {
    
	int user_id;
	String title;
	String content;
	LocalDate due_date;
	
	public newToDoDTO() {
		
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LocalDate getDue_date() {
		return due_date;
	}
	public void setDue_date(LocalDate due_date) {
		this.due_date = due_date;
	}
	


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	@Override
	public String toString() {
		return "newToDoDTO [title=" + title + ", content=" + content + ", due_date=" + due_date + "]";
	}
	
	
	
	
}
