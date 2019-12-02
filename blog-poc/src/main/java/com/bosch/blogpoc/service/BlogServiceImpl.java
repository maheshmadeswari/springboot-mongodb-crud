/**
 * 
 */
package com.bosch.blogpoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.blogpoc.entity.Blog;
import com.bosch.blogpoc.repo.BlogRepo;

/**
 * @author MSL6COB
 *
 */
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepo blogRepo;

	/**
	 * To Fetch All the Blogs.
	 * 
	 * @return List<Blog>
	 */
	@Override
	public List<Blog> fetchAll() {
		return blogRepo.findAll();
	}

	/**
	 * To fetch a blog by Id.
	 * 
	 * @param id id
	 * @return Blog
	 */
	@Override
	public Blog fetch(String id) {
		return blogRepo.findById(id).isPresent() ? blogRepo.findById(id).get() : null;
	}

	/**
	 * To create/update a blog.
	 * 
	 * @param blog blog
	 * @return Blog
	 */
	@Override
	public Blog save(Blog blog) {
		return blogRepo.save(blog);
	}

	/**
	 * To delete a blog by id.
	 * 
	 * @param id id
	 */
	@Override
	public void delete(String id) {
		blogRepo.deleteById(id);
	}

	/**
	 * To fetch by Dept.
	 */
	@Override
	public Blog fetchByDept(String dept) {
		return blogRepo.findByDepartment(dept);
	}

}
