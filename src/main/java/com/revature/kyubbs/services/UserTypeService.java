package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.*;

public interface UserTypeService {
	
	public UserType findUserTypeByUserAccount(String userAccount);
	public List<UserType> findAllUserType();
	public UserType addUserType(UserType a);
	public UserType findUserTypeById(Long id);
	public UserType updateUserTypeById(UserType a);
	public void deleteUserTypeById(UserType a);
	
}
