package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.BannedIp;
import com.revature.kyubbs.repositories.*;

@Service
@Transactional
public class BannedIpsServiceImpl implements BannedIpsService {

	@Autowired
	BannedIpRepository bannedIPRepo;

	@Override
	public List<BannedIp> findAllBannedIPs() {
		return bannedIPRepo.findAll();
	}

	@Override
	public BannedIp addBannedIP(BannedIp b) {
		return bannedIPRepo.save(b);
	}

	@Override
	public BannedIp findBannedIPByIpAddress(String ipAddress) {
		return bannedIPRepo.findBannedIpByIpAddress(ipAddress);
	}

	@Override
	public BannedIp findBannedIpById(Long id) {
		return bannedIPRepo.getOne(id);
	}

	@Override
	public BannedIp updateBannedIPById(BannedIp b) {
		return bannedIPRepo.save(b);
	}

	@Override
	public void deleteBannedIPById(BannedIp b) {
		bannedIPRepo.delete(b);
	}

}
