package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.Post;

public interface PostService {
	public List<Post> getAllPostsByThreadId(Long threadId);
	public Post findPostById(Long id);

	public void addPost(Post post);
	public void updatePost(Post post);
	public void deletePost(Post post);
}