/**
 * 
 */
package com.bosch.blogpoc.service;

import java.util.List;

import com.bosch.blogpoc.entity.Blog;

/**
 * @author MSL6COB
 *
 */
public interface BlogService {

	/**
	 * To Fetch All the Blogs.
	 * 
	 * @return List<Blog>
	 */
	List<Blog> fetchAll();

	/**
	 * To fetch a blog by Id.
	 * 
	 * @param id id
	 * @return Blog
	 */
	Blog fetch(String id);

	/**
	 * To Fetch By Department.
	 * 
	 * @param dept dept
	 * @return Blog
	 */
	Blog fetchByDept(String dept);

	/**
	 * To create/update a blog.
	 * 
	 * @param blog blog
	 * @return Blog
	 */
	Blog save(Blog blog);

	/**
	 * To delete a blog by id.
	 * 
	 * @param id id
	 */
	void delete(String id);

}
