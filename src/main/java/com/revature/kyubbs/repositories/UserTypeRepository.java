package com.revature.kyubbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface UserTypeRepository extends JpaRepository<UserType,Long>{
	
	public UserType findUserTypeByUserAccount(String userAccount);
	
}
