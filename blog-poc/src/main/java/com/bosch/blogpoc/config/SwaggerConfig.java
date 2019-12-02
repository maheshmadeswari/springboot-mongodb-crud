/**
 * 
 */
package com.bosch.blogpoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author MSL6COB
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("Blog-POC")
        .description("Spring boot + MongoDB CRUD Operations")
				.license(
						"Copyright 2019 (c) All rights by Robert Bosch GmbH. We reserve all rights of disposal such as copying and passing on to third parties.")
				.licenseUrl("https://www.bosch.de/").termsOfServiceUrl("").version("0.4.2")
				.contact(new Contact("", "", "sellamuthu.maheshkumar@in.bosch.com")).build();
	}

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("com.bosch.blogpoc.controller")).build()
				.apiInfo(apiInfo());
	}
}
