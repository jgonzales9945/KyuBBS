package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.revature.kyubbs.models.BannedIp;
import com.revature.kyubbs.services.BannedIpService;

@CrossOrigin
@RestController
@RequestMapping("/bannedip")
public class BannedIpController {
	
	@Autowired
	BannedIpService service;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<BannedIp> findAllBannedIps() {
		return service.findAllBannedIps();
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public BannedIp addBannedIp(@Valid @RequestBody BannedIp b) {
		return service.addBannedIp(b);
	}
	
	@GetMapping(value="/ipaddress/{ipaddress}", produces=MediaType.APPLICATION_JSON_VALUE)
	public BannedIp findBannedIPByIpAddress( @PathVariable("ipaddress") String ipAddress) {
		return service.findBannedIpByIpAddress(ipAddress);
	}
	
	@GetMapping(value="/id/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public BannedIp findBannedIpById(@PathVariable("id") Long id) {
		return service.findBannedIpById(id);
	}
	
	@PatchMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public BannedIp updateBannedIp(@Valid @RequestBody BannedIp b) {
		return service.updateBannedIp(b);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteBannedIp(@PathVariable("id")  Long id) {
		service.deleteBannedIp(id);
	}
}
