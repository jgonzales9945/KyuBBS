package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.KBUser;
import com.revature.kyubbs.repositories.KBUserRespository;

@Service
@Transactional
public class KBUserServiceImp implements KBUserService{

	@Autowired
	KBUserRespository userRepo;
	
	@Override
	public KBUser addUser(KBUser newUser) {
		
		for(KBUser user : findAllUsers() ) {
			if(user.getUsername().equals(newUser.getUsername())) {
				return null;
			}
		}
		
		return newUser;
	}

	@Override
	public List<KBUser> findAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public KBUser findUserByUsername(String username) {
		return userRepo.findUserByUsername(username);
	}

	@Override
	public KBUser findUserById(Long id) {
		return userRepo.getOne(id);
	}

	@Override
	public KBUser updateUserById(KBUser u) {
		return userRepo.save(u);
	}

	@Override
	public KBUser loginUser(KBUser u) {
		return userRepo.findUserByUsernameAndPassword(u.getUsername(), u.getPassword());
	}
	
}
