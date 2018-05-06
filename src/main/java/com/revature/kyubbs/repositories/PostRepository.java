package com.revature.kyubbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface PostRepository extends JpaRepository<Post,Long>{
	
}
