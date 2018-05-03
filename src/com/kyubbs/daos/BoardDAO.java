package com.kyubbs.daos;

import java.util.ArrayList;

/*pojos will need to be created*/
public interface BoardDAO {
	public ArrayList<Board> getAllBoards();
	public ArrayList<Board> getBoardsByCategory(String category);
	public Board getBoardsById(Int id);
	
	public void addBoard(Board board);
	
	public void updateBoardName(Board board);
	public void updateBoardDesc(Board board);
	public void updateBoardMaxThreads(Board board);
	public void updateBoardMaxPosts(Board board);
	
}