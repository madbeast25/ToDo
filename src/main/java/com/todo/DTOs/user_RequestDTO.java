package com.todo.DTOs;

public class user_RequestDTO {
     
	int id;
	String username;
	String password;

	
	public user_RequestDTO() {
		
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
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "user_RequestDTO [username=" + username + ", password=" + password + "]";
	}
	
	
}
