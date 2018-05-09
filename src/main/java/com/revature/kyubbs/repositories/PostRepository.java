package com.revature.kyubbs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	public List<Post> findPostByThreadId(Long threadId);
	public List<Post> findPostByIpAddress(String ipAddress);
	public List<Post> findPostByUserId(Long userId);
	public List<Post> findPostByName(String name);
}
