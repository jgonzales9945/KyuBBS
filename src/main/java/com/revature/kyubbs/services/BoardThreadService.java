package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.BoardThread;

public interface BoardThreadService {

	public List<BoardThread> findAllBoardThreads();

	public List<BoardThread> findBoardThreadsByIpAddress(String ipAddress);

	public List<BoardThread> findBoardThreadsByAuthenticatedUserId(Long authenticatedUserId);
	
	public List<BoardThread> findBoardThreadsByBoardId(Long boardId);

	public BoardThread findBoardThreadById(Long id);

	public BoardThread findBoardThreadByTitle(String title);

	public BoardThread findBoardThreadByName(String name);

	public BoardThread findBoardThreadBySubject(String subject);

	public BoardThread addBoardThread(BoardThread boardThread);

	public BoardThread updateThread(BoardThread boardThread);

	public void deleteBoardThread(BoardThread boardThread);

	// public void reportThread(Report repThread); // <--still needs implementation

}