package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.AESCrypt;
import com.revature.kyubbs.models.User;
import com.revature.kyubbs.repositories.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public User addUser(User newUser) {
		
		if(newUser.getPassword() == null) {
			return null;
		}
		
		for(User user : findAllUsers()) {
			
			if(user.getUsername().equals(newUser.getUsername())) {
				return null;
			}
		}
		
		try {
	        String encryptedPassword = AESCrypt.encrypt(newUser.getPassword());
	        newUser.setPassword(encryptedPassword);
		} catch(Exception e) {
			System.out.println("bug"+e.getMessage());
		}
		
		return userRepo.save(newUser);
	}

	@Override
	public List<User> findAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User findUserByUsername(String username) {
		return userRepo.findUserByUsername(username);
	}

	@Override
	public User findUserById(Long id) {
		return userRepo.getOne(id);
	}

	@Override
	public User updateUserById(User user) {
		return userRepo.save(user);
	}

	@Override
	public User loginUser(User user) {
		
		if(user.getPassword() == null) {
			return null;
		}
		
		try {
	        String encryptedPassword = AESCrypt.encrypt(user.getPassword());
	        user.setPassword(encryptedPassword);
		} catch(Exception e) {
			System.out.println("bug"+e.getMessage());
		}
		
		return userRepo.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
}
