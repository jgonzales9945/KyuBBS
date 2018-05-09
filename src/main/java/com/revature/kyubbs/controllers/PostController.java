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
@RequestMapping("/board/thread/post")
public class PostController {

	@Autowired
	private PostService postService;
	
<<<<<<< HEAD
//	@GetMapping(value = "/threadId/{threadId}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Post> findPostByThreadId(@PathVariable Long threadId) {
//		return postService.findPostByThreadId(threadId);
//	}
//	
//	@GetMapping(value = "/ipAddress/{ipAddress}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Post> findPostByIpAddress(@PathVariable String ipAddress) {
//		return postService.findPostByIpAddress(ipAddress);
//	}
//	
//	@GetMapping(value = "/userId/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Post> findPostByUserId(@PathVariable Long userId) {
//		return postService.findPostByUserId(userId);
//	}
//	
//	@GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Post> findPostByName(@PathVariable String name) {
//		return postService.findPostByName(name);
//	}
	
=======
	public PostController() {
		super();
	}

	@GetMapping(value = "/threadId/{threadId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Post> findPostsByThreadId(@PathVariable Long threadId) {
		return postService.getAllPostsByThreadId(threadId);
	}

>>>>>>> 4739b1d358a56c5b664eb3f2472072d6e47c0d20
	@GetMapping(value = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Post findPostById(@PathVariable Long id) {
		return postService.findPostById(id);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPost(@Valid @RequestBody Post post) {
		postService.addPost(post);
	}
	
	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePost(@Valid @RequestBody Post post) {
		postService.updatePost(post);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deletePost(Long id) {
		postService.deletePostById(id);
	}
}
