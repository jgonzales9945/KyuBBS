package com.revature.kyubbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.BannedIp;


public interface BannedIpRepository extends JpaRepository<BannedIp,Long>{
	
	public BannedIp findBannedIpByIpAddress(String ipAddress);
}
