package com.revature.kyubbs.services;

import java.util.*;

import com.revature.kyubbs.models.BannedIP;

/*pojos will need to be created*/
public interface BannedIpsService  {
	public List<BannedIP> findAllBannedIPs();
	public BannedIP addBannedIP(BannedIP b);
	public BannedIP findBannedIPByIpAddress(String ipAddress);
	public BannedIP findBannedIpById(Long id);
	public BannedIP updateBannedIPById(BannedIP b);
	public void deleteBannedIPById(BannedIP b);
}
