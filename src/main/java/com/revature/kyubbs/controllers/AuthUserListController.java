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

import com.revature.kyubbs.models.AuthUserList;
import com.revature.kyubbs.services.AuthUserListService;

@CrossOrigin
@RestController
@RequestMapping("/userlist")
public class AuthUserListController {
	
	@Autowired
	AuthUserListService service;
	
	@GetMapping(value="/{userName}", produces=MediaType.APPLICATION_JSON_VALUE)
	public AuthUserList findAuthUserListByUserName(@PathVariable("userName") String name) {
		return service.findAuthUserListByUserName(name);
	}
	
	@GetMapping(value="/{typeid}", produces=MediaType.APPLICATION_JSON_VALUE)
	public AuthUserList findAuthUserListByUserTypeId(@PathVariable("typeid")  int id) {
		return service.findAuthUserListByUserTypeId(id);
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<AuthUserList> findAllAuthUserLists() {
		return service.findAllAuthUserLists();
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public AuthUserList addAuthUserList(@Valid @RequestBody AuthUserList a) {
		return service.addAuthUserList(a);
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public AuthUserList findAuthUserListById(@PathVariable("id") Long id) {
		return service.findAuthUserListById(id);
	}
	
	@PatchMapping(produces="application/json", consumes=MediaType.APPLICATION_JSON_VALUE)
	public AuthUserList updateAuthUserList(@Valid @RequestBody AuthUserList a) {
		return service.updateAuthUserListById(a);
	}
	
	@GetMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deleteAuthUser(@Valid @RequestBody AuthUserList a) {
		service.deleteAuthUserListById(a);;
	}
	
}
