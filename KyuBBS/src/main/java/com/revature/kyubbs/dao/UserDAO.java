package com.revature.kyubbs.dao;

import com.revature.kyubbs.beans.User;

public interface UserDAO {
	
	public int addUser(User user);
	
	public User getUserById(int id);
	public User getUserByUsername(String username);
	
	public void updateUser(User user);
	
	public void deleteBear(User user);
	
}
