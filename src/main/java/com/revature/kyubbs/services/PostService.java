package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.Post;

public interface PostService {
	
	public List<Post> findPostByThreadId(Long threadId);
	public List<Post> findPostByIpAddress(String ipAddress);
	public List<Post> findPostByUserId(Long userId);
	public List<Post> findPostByName(String name);
	public List<Post> findAllPosts();
	public Post findPostById(Long id);
	public void addPost(Post post);
	public void updatePost(Post post);
	public void deletePostById(Long id);
}