package com.revature.kyubbs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	public List<Post> getPostsByIpAddress(String ipAddress);
	
	public List<Post> getAllPostsByThread(Long threadId);
}
