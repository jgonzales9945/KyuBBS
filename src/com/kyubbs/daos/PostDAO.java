package com.kyubbs.daos;

import java.util.*;

/*pojos will need to be created*/
public interface PostsDAO {
	public ArrayList<Post> getAllPostsByThread(int thread_id);
	
	public void addPost(Post post);
	
	public void updatePostFlag(Post post);
	public void updatePostContent(Post post);
	public void deletePost(Post post);
	public void reportPost(Report repPost);
	
}