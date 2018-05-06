package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.revature.kyubbs.models.Post;
import com.revature.kyubbs.services.PostService;

@CrossOrigin
@RestController
@RequestMapping("/boards/thread/posts")
public class PostController {

	@Autowired
	private PostService postService;
	
	public PostController() {
		super();
	}

	@GetMapping(value = "/{threadId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Post> findPostsByThreadId(@PathVariable Long threadId) {
		return postService.getAllPostsByThread(threadId);
	}

	@GetMapping(value = "/id/{postId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Post findBoardThreadsByBoardId(@PathVariable Long postId) {
		return postService.findPostById(postId);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPost(@Valid @RequestBody Post post) {
		postService.addPost(post);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePost(@Valid @RequestBody Post post) {
		postService.updatePost(post);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deletePost(@Valid @RequestBody Post post) {
		postService.deletePost(post);
	}
}
