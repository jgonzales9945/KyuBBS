package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.KBUser;

public interface KBUserService {
	
	public KBUser addUser(KBUser newUser);
	public List<KBUser> findAllUsers();
	public KBUser findUserByUsername(String username);
	public KBUser findUserById(Long id);
	public KBUser updateUserById(KBUser u);
	public KBUser loginUser(KBUser u);

}
