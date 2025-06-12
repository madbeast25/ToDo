package com.todo.Exceptions;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final Logger logger=LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<Map<String,String>> handleUserNotFound(UserNotFoundException ex){
		Map<String,String> errors=new HashMap<>();
		
		errors.put("StatusCode","404");
		errors.put("message",ex.getMessage());
		
		logger.warn(ex.getMessage());
		return new ResponseEntity<>(errors,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PasswordMissMatchException.class)
	public ResponseEntity<Map<String,String>> handlePassWordMissMatch(PasswordMissMatchException ex){
		Map<String,String> errors=new HashMap<>();
		
		errors.put("message",ex.getMessage());
		errors.put("StatusCode","400");
		
		return new ResponseEntity<>(errors,HttpStatus.BAD_REQUEST);
	}

}
