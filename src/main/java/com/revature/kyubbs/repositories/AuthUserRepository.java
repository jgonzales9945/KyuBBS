package com.revature.kyubbs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.kyubbs.models.AuthUser;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
	
	public List<AuthUser> findAuthUsersByUserTypeId(Long userTypeId);
	public AuthUser findAuthUserByUsername(String username);	
}
