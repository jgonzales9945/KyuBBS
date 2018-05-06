package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.AuthUserList;
import com.revature.kyubbs.repositories.AuthUserListRepository;

@Service
@Transactional
public class AuthUserListServiceImpl implements AuthUserListService{

	@Autowired
	AuthUserListRepository repo;
	
	@Override
	public AuthUserList findAuthUserListByUserName(String name) {
		return repo.findAuthUserListByUserName(name);
	}

	@Override
	public AuthUserList findAuthUserListByUserTypeId(int id) {
		return repo.findAuthUserListByUserTypeId(id);
	}

	@Override
	public List<AuthUserList> findAllAuthUserLists() {
		return repo.findAll();
	}

	@Override
	public AuthUserList addAuthUserList(AuthUserList a) {
		return repo.save(a);
	}

	@Override
	public AuthUserList findAuthUserListById(Long id) {
		return repo.getOne(id);
	}

	@Override
	public AuthUserList updateAuthUserListById(AuthUserList a) {
		return repo.save(a);
	}

	@Override
	public void deleteAuthUserListById(AuthUserList a) {
		repo.delete(a);
	}

}
