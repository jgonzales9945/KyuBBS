package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.BannedIp;

public interface BannedIpService {
	
	public List<BannedIp> findAllBannedIps();
	public BannedIp addBannedIp(BannedIp b);
	public BannedIp findBannedIpByIpAddress(String ipAddress);
	public BannedIp findBannedIpById(Long id);
	public BannedIp updateBannedIpById(BannedIp b);
	public void deleteBannedIpById(Long id);
	
}
