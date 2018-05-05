package com.revature.kyubbs.services;

import com.revature.kyubbs.models.AuthUser;

/*pojos will need to be created*/
public interface UserService {
	public AuthUser getAuthUserByName(String auName);
	
	public void addAuthUser(AuthUser user);
	
}