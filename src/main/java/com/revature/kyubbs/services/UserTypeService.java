package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.UserType;

public interface UserTypeService {
	
	public UserType findUserTypeByAccount(String account);
	public UserType addUserType(UserType type);
	public List<UserType> findAllUserTypes();
	public UserType findUserTypeById(Long id);
	public UserType updateUserTypeById(UserType type);
	public void deleteUserTypeById(Long id);
}
