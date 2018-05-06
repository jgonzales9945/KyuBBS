package com.revature.kyubbs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.kyubbs.models.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
	
	public Board findBoardByName(String name);
	public Board findBoardByDesc(String desc);
	public List<Board> findBoardsByCategoryId(Long categoryId);

}
