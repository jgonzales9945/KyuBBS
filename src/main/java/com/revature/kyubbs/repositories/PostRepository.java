package com.revature.kyubbs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface PostRepository extends JpaRepository<Post, Long> {
<<<<<<< HEAD
	
	public List<Post> getPostsByIpAddress(String ipAddress);
	
	public List<Post> getAllPostsByThread(Long threadId);
=======
	public List<Post> getPostsByIpAddress(String ipAddress);

	public List<Post> getAllPostsByThreadId(Long threadId);
>>>>>>> d1c30c2564938199c1f9bdb0ae972a76843e5a93
}
