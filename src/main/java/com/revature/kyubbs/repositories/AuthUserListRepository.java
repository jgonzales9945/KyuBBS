package com.revature.kyubbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface AuthUserListRepository extends JpaRepository<AuthUserList,Long>{
	
	public AuthUserList findAuthUserListByUserName(String name);
	public AuthUserList findAuthUserListByUserTypeId(int id);
	
}
