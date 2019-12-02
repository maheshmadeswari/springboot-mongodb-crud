/**
 * 
 */
package com.bosch.blogpoc.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

/**
 * @author MSL6COB
 *
 */
@Document(collection = "blog")
@Getter
@Setter
public class Blog {

	@Id
	private String id;

	private String department;

	private String title;

	private String author;

}
