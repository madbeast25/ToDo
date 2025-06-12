package com.todo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.todo.Models.User;

public interface AuthRepo extends JpaRepository<User, Integer> {

	 @Query(value = "SELECT * FROM users WHERE username=:username",nativeQuery = true)
	 public User findByUserName(@Param("username") String username);
	 
	 @Modifying
	 @Query(value = "UPDATE users SET password=:newPassword WHERE id=:id",nativeQuery = true)
	 public void updateById(@Param("id") int id,@Param("newPassword") String newPassword);
}
