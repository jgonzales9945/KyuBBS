package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.revature.kyubbs.models.KBUser;
import com.revature.kyubbs.services.KBUserService;

@CrossOrigin
@Controller
@RequestMapping("/login")
public class KBUserController {
	
	@Autowired
	KBUserService userService;
	
	@PostMapping( produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public KBUser addUser(@Valid @RequestBody KBUser newUser) {  //Tells JSON to find the body that can fit as an user
		return userService.addUser(newUser);					 //The @Valid will make sure that the validations for username are enforced
	}
	
	//Updates = PUT, Adding = POST, Remove = DELETE, getting = GET
	
	@PatchMapping(produces="application/json", consumes=MediaType.APPLICATION_JSON_VALUE)
	public KBUser updateUser(@Valid @RequestBody KBUser updatedUser) {
		return userService.updateUserById(updatedUser);
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<KBUser> findAllUsers() {
		return userService.findAllUsers();
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public KBUser finduserById(@PathVariable("id") Long id) {
		return userService.findUserById(id);
	}
	
	@PostMapping(value="/login", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public KBUser loginUser(@RequestBody KBUser user) {
		return userService.loginUser(user);
	}
}
