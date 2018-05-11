package com.revature.kyubbs.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.Board;
import com.revature.kyubbs.models.BoardThread;
import com.revature.kyubbs.repositories.BoardThreadRepository;

@Service
@Transactional
public class BoardThreadServiceImpl implements BoardThreadService {

	@Autowired
	BoardThreadRepository boardThreadRepo;

	@Override
	public List<BoardThread> findAllBoardThreads() {
		return boardThreadRepo.findAll();
	}

	@Override
	public BoardThread findBoardThreadById(Long id) {
		return boardThreadRepo.getOne(id);
	}

	@Override
	public List<BoardThread> findBoardThreadsByIpAddress(String ipAddress) {
		return boardThreadRepo.findBoardThreadsByIpAddress(ipAddress);
	}

	@Override
	public List<BoardThread> findBoardThreadsByUserId(Long authenticatedUserId) {
		return boardThreadRepo.findBoardThreadsByUserId(authenticatedUserId);
	}
	
	@Override
	public List<BoardThread> findBoardThreadsByBoardId(Long boardId) {
		
		Board board = new Board();
		board.setId(boardId);
		
		return boardThreadRepo.findBoardThreadsByBoardId(board);
	}

	@Override
	public BoardThread addBoardThread(BoardThread boardThread) {

		for (BoardThread bt : findAllBoardThreads()) {
			if (bt.getTitle().equals(boardThread.getTitle())) {
				return null;
			}
		}
		
		Timestamp date = new Timestamp(System.currentTimeMillis());
		
		boardThread.setFlag(0);
		boardThread.setStartDate(date);
		
		if(boardThread.getName() == null || boardThread.getName().trim().length() <= 0) {
			boardThread.setName("Anonymous");
		}
		
		return boardThreadRepo.save(boardThread);
	}

	@Override
	public BoardThread findBoardThreadByTitle(String title) {
		return boardThreadRepo.findBoardThreadByTitle(title);
	}

	@Override
	public BoardThread findBoardThreadByName(String name) {
		return boardThreadRepo.findBoardThreadByName(name);
	}

	@Override
	public BoardThread findBoardThreadBySubject(String subject) {
		return boardThreadRepo.findBoardThreadBySubject(subject);
	}

	@Override
	public BoardThread updateThread(BoardThread boardThread) {
		
		Timestamp date = new Timestamp(System.currentTimeMillis());
		boardThread.setModifiedDate(date);
		
		return boardThreadRepo.save(boardThread);
	}

	@Override
	public void deleteBoardThread(Long id) {
		boardThreadRepo.deleteById(id);
	}
}