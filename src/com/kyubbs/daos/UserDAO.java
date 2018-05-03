package com.kyubbs.daos;

import java.util.List;

/*pojos will need to be created*/
public interface BoardsDAO {
	public AuthUser getAuthUserByName(String auName);
	
	public void addAuthUser(AuthUser user);
	
}