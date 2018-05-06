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

import com.revature.kyubbs.models.UserType;
import com.revature.kyubbs.services.UserTypeService;

@CrossOrigin
@RestController
@RequestMapping("/usertype")
public class AuthUserListController {
	
	@Autowired
	UserTypeService service;
	
	@GetMapping(value="/{account}", produces=MediaType.APPLICATION_JSON_VALUE)
	public UserType findUserTypeByUserAccount(@PathVariable("account") String userAccount) {
		return service.findUserTypeByUserAccount(userAccount);
	}

	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<UserType> findAllUserType() {
		return service.findAllUserType();
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserType addUserType( @Valid @RequestBody UserType a) {
		return service.addUserType(a);
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public UserType findUserTypeById( @PathVariable("id") Long id) {
		return service.findUserTypeById(id);
	}
	
	@PatchMapping(produces="application/json", consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserType updateUserType(@Valid @RequestBody UserType a) {
		return service.updateUserTypeById(a);
	}
	
	@GetMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deleteUserType(@Valid @RequestBody UserType a) {
		service.deleteUserTypeById(a);
	}

}
