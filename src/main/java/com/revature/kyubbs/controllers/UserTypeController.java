package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.kyubbs.models.UserType;
import com.revature.kyubbs.services.UserTypeService;

@CrossOrigin
@RestController
@RequestMapping("/usertype")
public class UserTypeController {

	@Autowired
	UserTypeService userTypeService;
	
	@GetMapping(value="/account/{account}", produces=MediaType.APPLICATION_JSON_VALUE)
	public UserType findUserTypeByAccount(@PathVariable("account") String account) {
		return userTypeService.findUserTypeByAccount(account);
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserType addUserType(@Valid @RequestBody UserType type) {
		return userTypeService.addUserType(type);
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserType> findAllUserTypes() {
		return userTypeService.findAllUserTypes();
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public UserType findUserTypeById(@PathVariable("id") Long id) {
		return userTypeService.findUserTypeById(id);
	}
	
	@PatchMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserType updateUserType(@Valid @RequestBody UserType type) {
		return userTypeService.updateUserTypeById(type);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteUserType(@PathVariable("id") Long id) {
		userTypeService.deleteUserTypeById(id);
	}
}
