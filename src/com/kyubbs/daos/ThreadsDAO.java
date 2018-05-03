package com.kyubbs.daos;

import java.util.*;

/*pojos will need to be created*/
public interface ThreadsDAO {
	public ArrayList<WThread> getAllThreadsByBoard(int board_id);
	
	public void addThread(WThread thread);
	
	public void updateThreadFlag(WThread thread);
	public void updateThreadContent(WThread thread);
	public void deleteThread(WThread thread);
	public void reportThread(Report repThread);
	
}