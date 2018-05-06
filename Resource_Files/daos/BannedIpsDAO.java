package com.kyubbs.daos;

import java.util.*;

/*pojos will need to be created*/
public interface BannedIpsDAO {
	public ArrayList<IPAddress> getAllBannedIPs();
	public void addBannedIP(String ipAddr);
	public BannedIP checkBannedIPByAddr(String ipAddr);
	
	public void updateBannedIPByAddr(BannedIP bip);
	public void checkBannedIPByAddr(BannedIP bip);
	public void deleteBannedIP(BannedIP bip);
}
