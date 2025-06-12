package com.todo.DTOs;

import java.time.LocalDate;

public class user_ResponseDTO {
    
	int id;
	String username;
	int age;
	LocalDate created_at;
	
	public user_ResponseDTO() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "user_ResponseDTO [id=" + id + ", username=" + username + ", age=" + age + ", created_at=" + created_at
				+ "]";
	}
	
	
	
	
}
