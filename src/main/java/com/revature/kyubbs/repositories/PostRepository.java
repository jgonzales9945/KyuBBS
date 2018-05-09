package com.revature.kyubbs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface PostRepository extends JpaRepository<Post, Long> {
	
<<<<<<< HEAD
	public List<Post> findPostByThreadId(Long threadId);
	public List<Post> findPostByIpAddress(String ipAddress);
	public List<Post> findPostByUserId(Long userId);
	public List<Post> findPostByName(String name);
}
=======
	public List<Post> findPostsByIpAddress(String ipAddress);
	
	public List<Post> findPostsByThreadId(Long threadId);
}
>>>>>>> 4739b1d358a56c5b664eb3f2472072d6e47c0d20
