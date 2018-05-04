package com.revature.kyubbs.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.kyubbs.models.KBUser;
import com.revature.kyubbs.services.KBUserService;
import com.revature.kyubbs.services.KBUserServiceImp;

public class UserDAOTest {

	@Test
	public void findUserByIdTest() {

		KBUserService userService = new KBUserServiceImp();
		
		KBUser checkUser = userService.findUserById(1L);
		
		System.out.println(checkUser);
		if(checkUser.getUsername().equals("JoanelVR") && checkUser.getPassword().equals("12345678")) {
			assertTrue(true);
		}
	}

}
