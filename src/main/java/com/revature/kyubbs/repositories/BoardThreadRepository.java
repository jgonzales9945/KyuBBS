package com.revature.kyubbs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.kyubbs.models.BoardThread;

@Repository
public interface BoardThreadRepository extends JpaRepository<BoardThread, Long> {

	public BoardThread findBoardThreadByTitle(String title);

	public BoardThread findBoardThreadByName(String name);

	public BoardThread findBoardThreadBySubject(String subject);

	public List<BoardThread> findBoardThreadsByIpAddress(String ipAddress);

	public List<BoardThread> findBoardThreadsByAuthenticatedUserId(Long authenticatedUserId);
	
	public List<BoardThread> findBoardThreadsByBoardId(Long boardId);
}
