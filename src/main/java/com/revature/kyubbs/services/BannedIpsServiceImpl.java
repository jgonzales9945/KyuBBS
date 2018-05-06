package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.BannedIP;
import com.revature.kyubbs.repositories.BannedIPRepository;

@Service
@Transactional
public class BannedIpsServiceImpl implements BannedIpsService{

	@Autowired
	BannedIPRepository bannedIPRepo;
	
	@Override
	public List<BannedIP> findAllBannedIPs() {
		return bannedIPRepo.findAll();
	}

	@Override
	public BannedIP addBannedIP(BannedIP b) {
		return bannedIPRepo.save(b);
	}

	@Override
	public BannedIP findBannedIPByIpAddress(String ipAddress) {
		return bannedIPRepo.findBannedIPByIpAddress(ipAddress);
	}

	@Override
	public BannedIP findBannedIpById(Long id) {
		return bannedIPRepo.getOne(id);
	}

	@Override
	public BannedIP updateBannedIPById(BannedIP b) {
		return bannedIPRepo.save(b);
	}

	@Override
	public void deleteBannedIPById(BannedIP b) {
		bannedIPRepo.delete(b);
	}

}
