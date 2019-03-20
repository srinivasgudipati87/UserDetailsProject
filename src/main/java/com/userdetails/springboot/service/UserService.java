package com.userdetails.springboot.service;


import com.userdetails.springboot.model.User;

import java.util.List;

public interface UserService {
	
	User findById(Long id);

	User findByName(String name);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	void deleteAllUsers();

	List<User> findByStatus(String status);
	
	

	boolean isUserExist(User user);

	boolean isValid(User user);
}