package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.*;

public interface AuthUserListService {
	
	public AuthUserList findAuthUserListByUserName(String name);
	public AuthUserList findAuthUserListByUserTypeId(int id);
	public List<AuthUserList> findAllAuthUserLists();
	public AuthUserList addAuthUserList(AuthUserList a);
	public AuthUserList findAuthUserListById(Long id);
	public AuthUserList updateAuthUserListById(AuthUserList a);
	public void deleteAuthUserListById(AuthUserList a);
	
}
