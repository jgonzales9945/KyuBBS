package com.kyubbs.daos;

import java.util.List;

/*pojos will need to be created*/
public interface UserDAO {
	public AuthUser getAuthUserByName(String auName);
	
	public void addAuthUser(AuthUser user);
	
}