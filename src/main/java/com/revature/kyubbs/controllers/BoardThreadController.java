package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.revature.kyubbs.models.BoardThread;
import com.revature.kyubbs.services.BoardThreadService;

@CrossOrigin
@RestController
@RequestMapping("/board/thread")
public class BoardThreadController {

	@Autowired
	private BoardThreadService boardThreadService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BoardThread> findAllBoardThreads() {
		return boardThreadService.findAllBoardThreads();
	}

	@GetMapping(value = "/ip/{ipAddress}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BoardThread> findBoardThreadsByIpAddress(@PathVariable String ipAddress) {
		return boardThreadService.findBoardThreadsByIpAddress(ipAddress);
	}

	@GetMapping(value = "/authenticatedUserId/{authenticatedUserId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BoardThread> findBoardThreadsByAuthenticatedUserId(@PathVariable Long authenticatedUserId) {
		return boardThreadService.findBoardThreadsByAuthenticatedUserId(authenticatedUserId);
	}
	
	@GetMapping(value = "/boardId/{boardId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BoardThread> findBoardThreadsByBoardId(@PathVariable Long boardId) {
		return boardThreadService.findBoardThreadsByBoardId(boardId);
	}

	@GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public BoardThread findBoardThreadById(@PathVariable Long id) {
		return boardThreadService.findBoardThreadById(id);
	}

	@GetMapping(value = "/title/{title}", produces = MediaType.APPLICATION_JSON_VALUE)
	public BoardThread findBoardThreadByTitle(@PathVariable String title) {
		return boardThreadService.findBoardThreadByTitle(title);
	}

	@GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public BoardThread findBoardThreadByName(@PathVariable String name) {
		return boardThreadService.findBoardThreadByName(name);
	}

	@GetMapping(value = "/subject/{subject}", produces = MediaType.APPLICATION_JSON_VALUE)
	public BoardThread findBoardThreadBySubject(@PathVariable String subject) {
		return boardThreadService.findBoardThreadBySubject(subject);
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public BoardThread addBoardThread(@Valid @RequestBody BoardThread boardThread) {
		return boardThreadService.addBoardThread(boardThread);
	}

	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public BoardThread updateBoardThread(@Valid @RequestBody BoardThread boardThread) {
		return boardThreadService.updateThread(boardThread);
	}

	@DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteBoardThreadById(@PathVariable Long id) {
		boardThreadService.deleteBoardThread(boardThreadService.findBoardThreadById(id));
	}
}
