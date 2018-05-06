package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.kyubbs.models.AuthUser;
import com.revature.kyubbs.services.AuthUserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class AuthUserController {

	@Autowired
	private AuthUserService authUserService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AuthUser> findAllAuthUsers() {
		return authUserService.findAllAuthUsers();
	}

	@GetMapping(value = "/userTypeId/{userTypeId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AuthUser> findAuthUsersByUserTypeId(@PathVariable Long userTypeId) {
		return authUserService.findAuthUsersByUserTypeId(userTypeId);
	}

	@GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AuthUser findAuthUserById(@PathVariable Long id) {
		return authUserService.findAuthUserById(id);
	}

	@GetMapping(value = "/username/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
	public AuthUser findAuthUserByUsername(@PathVariable String username) {
		return authUserService.findAuthUserByUsername(username);
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AuthUser addAuthUser(@Valid @RequestBody AuthUser newUser) {
		return authUserService.addAuthUser(newUser);
	}

	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AuthUser updateAuthUser(@Valid @RequestBody AuthUser updatedUser) {
		return authUserService.updateAuthUser(updatedUser);
	}

	@DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteAuthUserById(@PathVariable Long id) {
		authUserService.deleteAuthUser(authUserService.findAuthUserById(id));
	}

	// @PostMapping(value="/login", produces=MediaType.APPLICATION_JSON_VALUE,
	// consumes=MediaType.APPLICATION_JSON_VALUE)
	// public AuthUser loginUser(@RequestBody AuthUser user) {
	// return userService.loginUser(user);
	// }
}