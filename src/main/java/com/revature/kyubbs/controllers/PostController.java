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
@RequestMapping("/boards/threads/posts")
public class PostController {

	@Autowired
	private PostService postService;
	
	public PostController() {
		super();
	}

//	@GetMapping(value = "/threadId/{threadId}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Post> findPostsByThreadId(@PathVariable Long threadId) {
//		return postService.getAllPostsByThread(threadId);
//	}

	@GetMapping(value = "/id/{postId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Post findBoardThreadsByBoardId(@PathVariable("postId") Long postId) {
		return postService.findPostById(postId);
	}
	
	@GetMapping(value = "/threadId/{threadId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Post> findPostsByThreadId(@PathVariable Long threadId) {
		return postService.findPostsByThreadId(threadId);
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Post> findAllPosts() {
		return postService.findAllPosts();
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Post addPost(@Valid @RequestBody Post post) {
		return postService.addPost(post);
	}
	
	@PatchMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Post updatePost(@Valid @RequestBody Post post) {
		return postService.updatePost(post);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deletePost(Long id) {
		postService.deletePost(id);
	}
	
}
