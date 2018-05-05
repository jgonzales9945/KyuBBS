package com.revature.kyubbs.services;

import java.util.*;

import com.revature.kyubbs.models.Post;
import com.revature.kyubbs.models.Report;

/*pojos will need to be created*/
public interface PostService {
	public ArrayList<Post> getAllPostsByThread(int thread_id);
	
	public void addPost(Post post);
	
	public void updatePostFlag(Post post);
	public void updatePostContent(Post post);
	public void deletePost(Post post);
	public void reportPost(Report repPost);
	
}