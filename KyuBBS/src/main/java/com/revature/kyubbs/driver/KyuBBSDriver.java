package com.revature.kyubbs.driver;

import com.revature.kyubbs.beans.User;
import com.revature.kyubbs.dao.UserDAO;
import com.revature.kyubbs.dao.UserDAOImp;

public class KyuBBSDriver {
	
	public static void main(String[] args) {
		
		UserDAO userDao = new UserDAOImp();
		User user = new User("JoanelVR", "12345678");
		
		System.out.println(userDao.getUserByUsername("JoanelVR"));
	}
}
