package com.revature.kyubbs.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.kyubbs.beans.User;
import com.revature.kyubbs.dao.UserDAO;
import com.revature.kyubbs.dao.UserDAOImp;

public class UserDAOTest {

	@Test
	public void addUserTest() {
		
		UserDAO userDao = new UserDAOImp();
		User user = new User();
	}

}
