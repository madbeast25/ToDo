package com.todo.DTOs;

import java.time.LocalDate;

public class newUser_RequestDTO {
     
	String username;
	String password;
	int age;
	LocalDate created_at;
	
	public newUser_RequestDTO() {
		
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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


	@Override
	public String toString() {
		return "newUser_RequestDTO [username=" + username + ", password=" + password + ", age=" + age + ", created_at="
				+ created_at + "]";
	}
	
	
	
	
}
