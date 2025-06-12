package com.todo.Wrappers;

import org.springframework.stereotype.Component;

import com.todo.DTOs.ToDoReqDTO;
import com.todo.DTOs.ToDoResponseDTO;
import com.todo.DTOs.newToDoDTO;
import com.todo.Models.Todo;

@Component
public class ToDoWrapper {
  
	public Todo toToDo(newToDoDTO todoDTO) {
		Todo todo=new Todo();
		
		todo.setTitle(todoDTO.getTitle());
		todo.setContent(todoDTO.getContent());
		todo.setDue_date(todoDTO.getDue_date());
		
		return todo;
	}
	
	public ToDoResponseDTO toToDoRes(Todo todo) {
		ToDoResponseDTO res=new ToDoResponseDTO();
		
		res.setId(todo.getT_id());
		res.setContent(todo.getContent());
		res.setTitle(todo.getTitle());
		res.setDue_date(todo.getDue_date());
		
		return res;
	}
	
}
