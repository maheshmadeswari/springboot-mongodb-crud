package com.bosch.blogpoc.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bosch.blogpoc.entity.Blog;

@Repository
public interface BlogRepo extends MongoRepository<Blog, String> {

	/**
	 * To Fetch by Department.
	 * 
	 * @param dept dept
	 * @return Blog
	 */
	Blog findByDepartment(String dept);
}
