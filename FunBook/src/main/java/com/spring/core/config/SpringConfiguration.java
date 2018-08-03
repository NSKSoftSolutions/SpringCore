package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.bean.Post;

@Configuration
public class SpringConfiguration {

	@Bean(name="post")
	public Post addPostDetails()
	{
	return  new Post();	
	}
	
	
}
