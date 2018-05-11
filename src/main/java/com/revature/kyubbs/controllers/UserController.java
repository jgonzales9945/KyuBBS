package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.kyubbs.models.User;
import com.revature.kyubbs.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public User addUser(@Valid @RequestBody User newUser) {
		return userService.addUser(newUser);
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> findAllUsers() {
		return userService.findAllUsers();
	}
	
	@PatchMapping(produces="application/json", consumes=MediaType.APPLICATION_JSON_VALUE)
	public User updateUser(@Valid @RequestBody User updatedUser) {
		return userService.updateUserById(updatedUser);
	}
	
	@GetMapping(value="/id/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public User findUserById(@PathVariable("id") Long id) {
		return userService.findUserById(id);
	}
	
	@PostMapping(value="/login", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public User loginUser(@RequestBody User user) {
		return userService.loginUser(user);
	}
}
