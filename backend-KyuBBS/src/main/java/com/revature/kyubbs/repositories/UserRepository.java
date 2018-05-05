package com.revature.kyubbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.kyubbs.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
	
	public User findUserByUsername(String username);
	public User findUserByUsernameAndPassword(String username, String password);
	
}
