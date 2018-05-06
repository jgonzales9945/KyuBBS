package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.revature.kyubbs.models.Board;
import com.revature.kyubbs.services.BoardService;

@CrossOrigin
@RestController
@RequestMapping("/boards")
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Board> findAllBoards() {
		return boardService.findAllBoards();
	}

	@GetMapping(value = "/categoryId/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Board> findBoardsByCategoryId(@PathVariable Long categoryId) {
		return boardService.findBoardsByCategoryId(categoryId);
	}
	
	@GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Board findBoardById(@PathVariable Long id) {
		return boardService.findBoardById(id);
	}
	
	@GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Board findBoardByName(@PathVariable String name) {
		return boardService.findBoardByName(name);
	}
	
	@GetMapping(value = "/desc/{desc}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Board findBoardByDesc(@PathVariable String desc) {
		return boardService.findBoardByDesc(desc);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Board addBoard(@Valid @RequestBody Board board) {
		return boardService.addBoard(board);
	}
	
	@PatchMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Board updateBoard(@Valid @RequestBody Board board) {
		return boardService.updateBoard(board);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteBoardById(@PathVariable Long id) {
		boardService.deleteBoard(boardService.findBoardById(id));
	}
}
