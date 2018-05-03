package com.kyubbs.daos;

import java.util.List;

/*pojos will need to be created*/
public interface BoardsDAO {
	public List<Boards> getAllBoards();
	public List<Boards> getBoardsByCategory(String category);
	public Boards getBoardsById(Int id);
	
	public void addBoard(Board board);
	
	public void updateBoardName(Board board);
	public void updateBoardDesc(Board board);
	public void updateBoardMaxThreads(Board board);
	public void updateBoardMaxPosts(Board board);
	
}