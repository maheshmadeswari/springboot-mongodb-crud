/**
 * 
 */
package com.bosch.blogpoc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.blogpoc.entity.Blog;
import com.bosch.blogpoc.service.BlogService;

/**
 * @author MSL6COB
 *
 */
@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;

	@GetMapping("/get")
	public List<Blog> fetchAll() {
		return blogService.fetchAll();
	}

	@GetMapping("/get/{id}")
	public Blog fetch(@PathVariable String id) {
		return blogService.fetch(id);
	}

	@GetMapping("/getByDept/{dept}")
	public Blog fetchByDept(@PathVariable String dept) {
		return blogService.fetchByDept(dept);
	}

	@PutMapping("/create")
	public Blog create(@Valid @RequestBody Blog blog) {
		return blogService.save(blog);
	}

	@PostMapping("/update")
	public Blog update(@Valid @RequestBody Blog blog) {
		return blogService.save(blog);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable String id) {
		blogService.delete(id);
	}
}
