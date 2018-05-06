package com.revature.kyubbs.services;

import java.util.*;

import com.revature.kyubbs.models.Post;

/*pojos will need to be created*/
public interface PostService {
	public List<Post> getAllPostsByThread(Long thread_id);
	public Post findPostById(Long id);

	public void addPost(Post post);
	public void updatePostFlag(Post post);
	public void updatePostContent(Post post);
	public void deletePost(Post post);
}