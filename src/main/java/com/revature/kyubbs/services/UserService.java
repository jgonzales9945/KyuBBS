package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.User;

public interface UserService {
	
	public User addUser(User newUser);
	public List<User> findAllUsers();
	public User findUserByUsername(String username);
	public User findUserById(Long id);
	public User updateUserById(User user);
	public User loginUser(User user);
	
}
