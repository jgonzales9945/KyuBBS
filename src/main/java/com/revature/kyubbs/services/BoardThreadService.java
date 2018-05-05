package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.BoardThread;
import com.revature.kyubbs.models.Report;

/*pojos will need to be created*/
public interface BoardThreadService {
	public List<BoardThread> getAllThreadsByBoard(int board_id);
	
	public void addThread(BoardThread thread);
	
	public void updateThreadFlag(BoardThread thread);
	public void updateThreadContent(BoardThread thread);
	public void deleteThread(BoardThread thread);
	public void reportThread(Report repThread);
	
}