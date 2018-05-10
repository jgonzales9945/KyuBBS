package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.UserType;
import com.revature.kyubbs.repositories.UserTypeRepository;

@Service
@Transactional
public class UserTypeServiceImpl implements UserTypeService{

	@Autowired
	UserTypeRepository userTypeRepo;
	
	@Override
	public UserType findUserTypeByAccount(String account) {
		return userTypeRepo.findUserTypeByAccount(account);
	}

	@Override
	public UserType addUserType(UserType type) {
		return userTypeRepo.save(type);
	}

	@Override
	public List<UserType> findAllUserTypes() {
		return userTypeRepo.findAll();
	}

	@Override
	public UserType findUserTypeById(Long id) {
		return userTypeRepo.getOne(id);
	}

	@Override
	public UserType updateUserTypeById(UserType type) {
		return userTypeRepo.save(type);
	}

	@Override
	public void deleteUserTypeById(Long id) {
		userTypeRepo.deleteById(id);
	}

}
