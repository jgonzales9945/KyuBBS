package com.revature.kyubbs.service;

import com.revature.kyubbs.beans.User;
import com.revature.kyubbs.dao.UserDAO;
import com.revature.kyubbs.dao.UserDAOImp;

public class UserService {
	
	private static UserDAO userDao = new UserDAOImp();
	
	public User loginUser(User user) {
		
		User match = userDao.getUserByUsername(user.getUsername());
		
		if(match != null) {
			if(user.getUsername().equals(match.getUsername()) && user.getPassword().equals(match.getPassword())) {
				
				return match;
			}
		}
		
		return null;
	}
}
