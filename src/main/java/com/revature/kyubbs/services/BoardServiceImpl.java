package com.revature.kyubbs.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.Board;
import com.revature.kyubbs.repositories.BoardRepository;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardRepository boardRepo;

	@Override
	public List<Board> findAllBoards() {
		return boardRepo.findAll();
	}

	@Override
	public List<Board> findBoardsByCategoryId(Long categoryId) {
		return boardRepo.findBoardsByCategoryId(categoryId);
	}

	@Override
	public Board findBoardById(Long id) {
		return boardRepo.getOne(id);
	}

	@Override
	public Board findBoardByName(String name) {
		return boardRepo.findBoardByName(name);
	}

	@Override
	public Board findBoardByDesc(String desc) {
		return boardRepo.findBoardByDesc(desc);
	}

	@Override
	public Board addBoard(Board board) {
		
		for (Board b : findAllBoards()) {
			if (b.getName().equals(board.getName())) {
				return null;
			}
		}
		
		Timestamp date = new Timestamp(System.currentTimeMillis());
		board.setStartDate(date);
		board.setMaxPosts(50);
		board.setMaxThreads(20);
		
		return boardRepo.save(board);
	}

	@Override
	public Board updateBoard(Board board) {
		return boardRepo.save(board);
	}

	@Override
	public void deleteBoard(Long id) {
		boardRepo.deleteById(id);;
	}
}