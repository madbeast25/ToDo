package com.todo.Wrappers;

import org.springframework.stereotype.Component;

import com.todo.DTOs.newUser_RequestDTO;
import com.todo.DTOs.user_ResponseDTO;
import com.todo.Models.User;

@Component
public class UserWrapper {

	public user_ResponseDTO toResponseDTO(User user) {
		user_ResponseDTO dto=new user_ResponseDTO();
		
		dto.setUsername(user.getUsername());
		dto.setAge(user.getAge());
		dto.setCreated_at(user.getCreated_at());
		dto.setId(user.getId());
		
		return dto;
	}
	
	public User toUser(newUser_RequestDTO newUser) {
		User user=new User();
		
		user.setUsername(newUser.getUsername());
		user.setPassword(newUser.getPassword());
		user.setAge(newUser.getAge());
		user.setCreated_at(newUser.getCreated_at());
		
		
		return user;
	}
}
