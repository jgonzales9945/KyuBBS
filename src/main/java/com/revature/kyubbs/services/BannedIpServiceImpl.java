package com.revature.kyubbs.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.BannedIp;
import com.revature.kyubbs.repositories.BannedIpRepository;

@Service
@Transactional
public class BannedIpServiceImpl implements BannedIpService{

	@Autowired
	BannedIpRepository bannedIPRepo;
	
	@Override
	public List<BannedIp> findAllBannedIps() {
		return bannedIPRepo.findAll();
	}

	@Override
	public BannedIp addBannedIp(BannedIp b) {
		
		Timestamp date = new Timestamp(System.currentTimeMillis());
		b.setStartDate(date);
		
		return bannedIPRepo.save(b);
	}

	@Override
	public BannedIp findBannedIpByIpAddress(String ipAddress) {
		return bannedIPRepo.findBannedIpByIpAddress(ipAddress);
	}

	@Override
	public BannedIp findBannedIpById(Long id) {
		return bannedIPRepo.getOne(id);
	}

	@Override
	public BannedIp updateBannedIp(BannedIp b) {
		return bannedIPRepo.save(b);
	}

	@Override
	public void deleteBannedIp(Long id) {
		bannedIPRepo.deleteById(id);
	}
}
