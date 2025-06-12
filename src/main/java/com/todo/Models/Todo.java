package com.todo.Models;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int t_id;
	@Column(name = "user_id",nullable = false)
	int user_id;
	@Column(name = "title",nullable = false)
	String title;
	@Column(name = "content",nullable = false)
	String content;
	@Column(name = "created")
	@CreationTimestamp
	LocalDate created_at;
	@Column(name = "due_date",nullable = false)
	LocalDate due_date;
	
	public Todo() {
		
	}
	
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
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
	public LocalDate getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}
	public LocalDate getDue_date() {
		return due_date;
	}
	public void setDue_date(LocalDate due_date) {
		this.due_date = due_date;
	}


	@Override
	public String toString() {
		return "Todo [t_id=" + t_id + ", title=" + title + ", content=" + content + ", created_at=" + created_at
				+ ", due_date=" + due_date + "]";
	}
	
	
	
	
}
