package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.Post;

public interface PostService {
	
	// public List<Post> getAllPostsByThread(Long thread_id);
	public List<Post> findAllPosts();
	public Post findPostById(Long id);
	public Post addPost(Post post);
	public Post updatePost(Post post);
	public void deletePost(Long id);
}