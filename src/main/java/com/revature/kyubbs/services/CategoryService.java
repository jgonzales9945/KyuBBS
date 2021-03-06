package com.revature.kyubbs.services;

import java.util.List;

import com.revature.kyubbs.models.*;

public interface CategoryService {
	
	public Category findCategoryByName(String name);
	public Category addCategory(Category c);
	public List<Category> findAllCategories();
	public Category findCategoryById(Long id);
	public Category updateCategory(Category c);
	public void deleteCategory(Long id);
	
}
