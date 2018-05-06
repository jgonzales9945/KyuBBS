package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	public List<BoardThread> findBoardThreadsByAuthenticatedUserId(Long authenticatedUserId) {
		return boardThreadRepo.findBoardThreadsByAuthenticatedUserId(authenticatedUserId);
	}

	@Override
	public BoardThread addBoardThread(BoardThread boardThread) {

		for (BoardThread bt : findAllBoardThreads()) {
			if (bt.getName().equals(bt.getName())) {
				return null;
			}
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
		return boardThreadRepo.save(boardThread);
	}

	@Override
	public void deleteBoardThread(BoardThread boardThread) {
		boardThreadRepo.delete(boardThread);
	}
}