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
	UserTypeRepository repo;

	@Override
	public UserType findUserTypeByUserAccount(String userAccount) {
		return repo.findUserTypeByUserAccount(userAccount);
	}

	@Override
	public List<UserType> findAllUserType() {
		return repo.findAll();
	}

	@Override
	public UserType addUserType(UserType a) {
		return repo.save(a);
	}

	@Override
	public UserType findUserTypeById(Long id) {
		return repo.getOne(id);
	}

	@Override
	public UserType updateUserTypeById(UserType a) {
		return repo.save(a);
	}

	@Override
	public void deleteUserTypeById(UserType a) {
		repo.delete(a);
	}
}
