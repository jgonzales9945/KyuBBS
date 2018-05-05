package com.revature.kyubbs.services;

import java.util.*;

import com.revature.kyubbs.models.BannedIP;

/*pojos will need to be created*/
public interface BannedIpsService  {
	public ArrayList<BannedIP> getAllBannedIPs();
	public void addBannedIP(String ipAddr);
	public BannedIP checkBannedIPByAddr(String ipAddr);
	
	public void updateBannedIPByAddr(BannedIP bip);
	public void checkBannedIPByAddr(BannedIP bip);
	public void deleteBannedIP(BannedIP bip);
}
