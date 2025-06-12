package com.todo.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.DTOs.newUser_RequestDTO;
import com.todo.DTOs.user_RequestDTO;
import com.todo.DTOs.user_ResponseDTO;
import com.todo.Exceptions.PasswordMissMatchException;
import com.todo.Exceptions.UserNotFoundException;
import com.todo.Models.User;
import com.todo.Repositories.AuthRepo;
import com.todo.Wrappers.UserWrapper;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AuthServices {
	
	@Autowired
	AuthRepo auth;
	@Autowired
	UserWrapper wrapper;

	public user_ResponseDTO loginUser(user_RequestDTO user) throws UserNotFoundException, PasswordMissMatchException {
		int user_id=user.getId();
		User exist=auth.findById(user_id).get();
		
		if(exist == null) {
			throw new UserNotFoundException("User not found!!!");
		}
		
		if(!exist.getPassword().equals(user.getPassword())) {
			throw new PasswordMissMatchException("Sorry wrong password try again");
		}
		
		user_ResponseDTO res=wrapper.toResponseDTO(exist);
		return res;
	}
	
	public user_ResponseDTO addNewUser(newUser_RequestDTO newUser) {
		  User user=wrapper.toUser(newUser);
		  auth.save(user);
		  
		  user_ResponseDTO res=wrapper.toResponseDTO(user);
		  
		  return res;
	}
	
	
	public String changePassword(int id,String newPassword) throws UserNotFoundException {
		 User user=auth.findById(id).get();
		 
		 if(user == null) {
			 throw new UserNotFoundException("User not found 404!!");
		 }
		 	 
		 try {
			 auth.updateById(id, newPassword);
		 }catch(Exception e) {
			 return e.getMessage();
		 }
		 
		 return "Password Changed successfully!!!";
		 
	}
}
