package com.kyubbs.daos;

import java.util.List;

/*pojos will need to be created*/
public interface PostDAO {
	public List<Post> getAllThreadsByBoard(int board_id);
	
	public void addThread(Thread thread);
	
	public void updateThreadFlag(Thread thread);
	public void updateThreadContent(Thread thread);
	public void deleteThread(Thread thread);
	public void reportThread(Report repThread);
	
}