package com.todo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.todo.DTOs.ToDoReqDTO;
import com.todo.DTOs.ToDoResponseDTO;
import com.todo.DTOs.newToDoDTO;
import com.todo.Services.TodoServices;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/todo")
public class ToDoController {
  
	@Autowired
	TodoServices service;
	
	@PostMapping("/addTodo")
	public ResponseEntity<String> addNewToDo(@RequestBody newToDoDTO newTodo){
		String res=service.addTodo(newTodo);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@GetMapping("/getToDos/{id}")
	public ResponseEntity<List<ToDoResponseDTO>> getTodos(@PathVariable("id") int id){
		List<ToDoResponseDTO> res=service.getToDosById(id);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteTodo/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		String res = service.deleteTodo(id);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> update(@PathVariable int id,@RequestBody ToDoReqDTO req ){
		String res=service.updateTodo(id, req);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
