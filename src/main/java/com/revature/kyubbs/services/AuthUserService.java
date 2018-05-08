package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.AuthUser;

public interface AuthUserService {

	public List<AuthUser> findAllAuthUsers();

	public List<AuthUser> findAuthUsersByUserTypeId(Long userTypeId);

	public AuthUser findAuthUserById(Long id);

	public AuthUser findAuthUserByUsername(String username);

	public AuthUser addAuthUser(AuthUser authUser);

	public AuthUser updateAuthUser(AuthUser authUser);

	public void deleteAuthUser(AuthUser authUser);
}
