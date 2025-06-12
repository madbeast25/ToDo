package com.todo.DTOs;

import java.time.LocalDate;

public class ToDoResponseDTO {
	
	int id;
	String title;
	String content;
	LocalDate due_date;
	
	public ToDoResponseDTO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "ToDoResponseDTO [id=" + id + ", title=" + title + ", content=" + content + ", due_date=" + due_date
				+ "]";
	}
	
	
	
	

}
