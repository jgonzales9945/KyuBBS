package com.revature.kyubbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.KBUser;

public interface KBUserRespository extends JpaRepository<KBUser,Long> {
	
	public KBUser findUserByUsername(String username);
	public KBUser findUserByUsernameAndPassword(String username, String password);
}
