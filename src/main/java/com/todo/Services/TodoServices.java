package com.todo.Services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.DTOs.ToDoReqDTO;
import com.todo.DTOs.ToDoResponseDTO;
import com.todo.DTOs.newToDoDTO;
import com.todo.Models.Todo;
import com.todo.Repositories.TodoRepo;
import com.todo.Wrappers.ToDoWrapper;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TodoServices {
    
	@Autowired
	ToDoWrapper wrapper;
	
	@Autowired
	TodoRepo repo;
	
	public String addTodo(newToDoDTO todo) {
		Todo newToDo=wrapper.toToDo(todo);
		
		try {
			repo.save(newToDo);
		}catch(Exception ex) {
			System.out.print(ex.getMessage());
			return ex.getMessage();
		}
		
		return "Created new TODO successfully!!!";
	}
	
	public List<ToDoResponseDTO> getToDosById(int id){
		List<Todo> todos=repo.findTodos(id);
		List<ToDoResponseDTO> res=new ArrayList<>();
		
		for(Todo todo:todos) {
		   ToDoResponseDTO dto=wrapper.toToDoRes(todo);
		   res.add(dto);
		}
		
		return res;
	}
	
	public String deleteTodo(int id) {
		try {
			repo.deleteById(id);	
		}catch(Exception ex) {
			return ex.getMessage();
		}
		
		return "ToDo removed SuccessFully!!!";
		
	}
	
	
	public String updateTodo(int id,ToDoReqDTO req) {
		
			String title=req.getTitle();
			String content=req.getContent();
			LocalDate due_date=req.getDue_date();
			
			repo.updateTodo(id, title, content, due_date);;
		
			
		return "Todo updated successfully!!!";
	}
}
