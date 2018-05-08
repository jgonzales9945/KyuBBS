package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.Board;

public interface BoardService {

	public List<Board> findAllBoards();

	public List<Board> findBoardsByCategoryId(Long categoryId);

	public Board findBoardById(Long id);

	public Board findBoardByName(String name);

	public Board findBoardByDesc(String desc);

	public Board addBoard(Board board);

	public Board updateBoard(Board board);

	public void deleteBoard(Board board);
}