package com.kyubbs.daos;

import java.util.List;

/*pojos will need to be created*/
public interface ThreadDAO {
	public List<BoardThread> getAllThreadsByBoard(int board_id);
	
	public void addThread(BoardThread thread);
	
	public void updateThreadFlag(BoardThread thread);
	public void updateThreadContent(BoardThread thread);
	public void deleteThread(BoardThread thread);
	public void reportThread(Report repThread);
	
}