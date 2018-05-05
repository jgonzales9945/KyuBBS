package com.revature.kyubbs.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.kyubbs.models.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board,Long>{
	
	public ArrayList<Board> findBoardByCategory(String category);
	
	public void updateBoardByName(Board board);
	public void updateBoardByDescription(Board board);
	public void updateBoardByMaxThreads(Board board);
	public void updateBoardByMaxPosts(Board board);
}
