package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.Post;

public interface PostService {
<<<<<<< HEAD
	
	public List<Post> findPostByThreadId(Long threadId);
	public List<Post> findPostByIpAddress(String ipAddress);
	public List<Post> findPostByUserId(Long userId);
	public List<Post> findPostByName(String name);
	public List<Post> findAllPosts();
=======
	public List<Post> getAllPostsByThreadId(Long threadId);
>>>>>>> 4739b1d358a56c5b664eb3f2472072d6e47c0d20
	public Post findPostById(Long id);
	public void addPost(Post post);
	public void updatePost(Post post);
	public void deletePostById(Long id);
}