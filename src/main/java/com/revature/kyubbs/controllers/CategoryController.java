package com.revature.kyubbs.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.kyubbs.models.Category;
import com.revature.kyubbs.services.CategoryService;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService service;
	
	@GetMapping(value="/name/{name}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Category findCategoryByName(@PathVariable("name") String name) {
		return service.findCategoryByName(name);
	}
	
	@PostMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Category addCategory(@Valid @RequestBody Category c) {
		return service.addCategory(c);
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Category> findAllCategories() {
		return service.findAllCategories();
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Category findCategoryById(@PathVariable("id") Long id) {
		return service.findCategoryById(id);
	}
	
	@PatchMapping(produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Category updateCategory(@Valid @RequestBody Category c) {
		return service.updateCategory(c);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public void deleteCategory(@PathVariable("id") Long id) {
		service.deleteCategory(id);
	}
}
