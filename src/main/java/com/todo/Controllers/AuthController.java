package com.todo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todo.DTOs.newUser_RequestDTO;
import com.todo.DTOs.user_RequestDTO;
import com.todo.DTOs.user_ResponseDTO;
import com.todo.Exceptions.PasswordMissMatchException;
import com.todo.Exceptions.UserNotFoundException;
import com.todo.Models.User;
import com.todo.Services.AuthServices;

@RestController
@RequestMapping("/auth")
public class AuthController {
    
	@Autowired
	AuthServices service;
	
	@PostMapping("/login")
	public ResponseEntity<user_ResponseDTO> login(@RequestBody user_RequestDTO user) throws UserNotFoundException, PasswordMissMatchException{
		user_ResponseDTO res=service.loginUser(user);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@PostMapping("/signup")
	public ResponseEntity<user_ResponseDTO> signup(@RequestBody newUser_RequestDTO newUser){
		user_ResponseDTO res=service.addNewUser(newUser);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@PutMapping("/changePassword")
	public ResponseEntity<String> change(@RequestParam("id") int id,@RequestParam("password") String newPassword) throws UserNotFoundException{
		String res=service.changePassword(id, newPassword);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
