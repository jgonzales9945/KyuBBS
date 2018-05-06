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

import com.revature.kyubbs.models.BannedIP;
import com.revature.kyubbs.services.BannedIpsService;

@CrossOrigin
@RestController
@RequestMapping("/bannedip")
public class BannedIpsController {
	
	@Autowired
	BannedIpsService service;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<BannedIP> findAllBannedIPs() {
		return service.findAllBannedIPs();
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public BannedIP addBannedIP(@Valid @RequestBody BannedIP b) {
		return service.addBannedIP(b);
	}
	
	@GetMapping(value="/{ipaddress}", produces=MediaType.APPLICATION_JSON_VALUE)
	public BannedIP findBannedIPByIpAddress( @PathVariable("ipaddress") String ipAddress) {
		return service.findBannedIPByIpAddress(ipAddress);
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public BannedIP findBannedIpById(@PathVariable("id") Long id) {
		return service.findBannedIpById(id);
	}
	
	@PatchMapping(produces="application/json", consumes=MediaType.APPLICATION_JSON_VALUE)
	public BannedIP updateBannedIP(@Valid @RequestBody BannedIP b) {
		return service.updateBannedIPById(b);
	}
	
	@DeleteMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public void deleteBannedIP(@Valid @RequestBody BannedIP b) {
		service.deleteBannedIPById(b);
	}
}
