package com.revature.kyubbs.services;

import java.util.*;

import com.revature.kyubbs.models.BannedIp;

/*pojos will need to be created*/
public interface BannedIpsService {
	public List<BannedIp> findAllBannedIPs();

	public BannedIp addBannedIP(BannedIp b);

	public BannedIp findBannedIPByIpAddress(String ipAddress);

	public BannedIp findBannedIpById(Long id);

	public BannedIp updateBannedIPById(BannedIp b);

	public void deleteBannedIPById(BannedIp b);
}
