package com.revature.kyubbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface BannedIPRepository extends JpaRepository<BannedIP,Long>{

	public BannedIP findBannedIPByIpAddress(String ipAddress);
}
