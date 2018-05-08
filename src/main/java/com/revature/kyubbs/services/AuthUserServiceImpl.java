package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.AuthUser;
import com.revature.kyubbs.repositories.AuthUserRepository;

@Service
@Transactional
public class AuthUserServiceImpl implements AuthUserService {

	@Autowired
	AuthUserRepository authUserRepo;

	@Override
	public List<AuthUser> findAllAuthUsers() {
		return authUserRepo.findAll();
	}

	@Override
	public List<AuthUser> findAuthUsersByUserTypeId(Long userTypeId) {
		return authUserRepo.findAuthUsersByUserTypeId(userTypeId);
	}

	@Override
	public AuthUser findAuthUserById(Long id) {
		return authUserRepo.getOne(id);
	}

	@Override
	public AuthUser findAuthUserByUsername(String username) {
		return authUserRepo.findAuthUserByUsername(username);
	}

	@Override
	public AuthUser addAuthUser(AuthUser authUser) {
		for (AuthUser au : findAllAuthUsers()) {
			if (au.getUsername().equals(au.getUsername())) {
				return null;
			}
		}
		return authUserRepo.save(authUser);
	}

	@Override
	public AuthUser updateAuthUser(AuthUser authUser) {
		return authUserRepo.save(authUser);
	}

	@Override
	public void deleteAuthUser(AuthUser authUser) {
		authUserRepo.delete(authUser);

	}
}
