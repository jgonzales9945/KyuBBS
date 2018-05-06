package com.revature.kyubbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.kyubbs.models.*;

public interface CategoryRepository extends JpaRepository<Category,Long>{
	
	public Category findCategoryByName(String name);
	
}
