package com.revature.kyubbs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.kyubbs.models.Category;
import com.revature.kyubbs.repositories.CategoryRepository;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository repo;
	
	@Override
	public Category findCategoryByName(String name) {
		return repo.findCategoryByName(name);
	}

	@Override
	public Category addCategory(Category c) {
		return repo.save(c);
	}

	@Override
	public List<Category> findAllCategories() {
		return repo.findAll();
	}

	@Override
	public Category findCategoryById(Long id) {
		return repo.getOne(id);
	}

	@Override
	public Category updateCategory(Category c) {
		// TODO Auto-generated method stub
		return repo.save(c);
	}

	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
