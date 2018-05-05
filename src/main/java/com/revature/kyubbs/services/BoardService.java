package com.revature.kyubbs.services;

import java.util.*;

import com.revature.kyubbs.models.Board;

/*pojos will need to be created*/
public interface BoardService {
	public ArrayList<Board> getAllBoards();
	public ArrayList<Board> getBoardsByCategory(String category);
	public Board getBoardsById(int id);
	
	public void addBoard(Board board);
	
	public void updateBoardName(Board board);
	public void updateBoardDesc(Board board);
	public void updateBoardMaxThreads(Board board);
	public void updateBoardMaxPosts(Board board);
	
}