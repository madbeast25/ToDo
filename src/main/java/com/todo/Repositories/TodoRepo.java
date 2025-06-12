package com.todo.Repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.todo.Models.Todo;


@Repository
public interface TodoRepo extends JpaRepository<Todo,Integer> {
    
	@Query(value = "SELECT * FROM todos WHERE user_id=:id",nativeQuery = true)
	List<Todo> findTodos(@Param("id") int id);
	
	@Modifying
	@Query(value = "UPDATE todos SET title=:title,content=:content,due_date=:due_date WHERE t_id=:id",nativeQuery = true)
	public void updateTodo(@Param("id") int id,@Param("title") String title,@Param("content") String content,@Param("due_date") LocalDate due_date);
}
