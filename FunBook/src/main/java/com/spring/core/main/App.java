package com.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.bean.Post;
import com.spring.core.config.SpringConfiguration;


public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Post post = context.getBean(Post.class);
		System.out.println(post.getPosted_by());
		System.out.println(post.getPost_type());
		System.out.println(post.getPosted_from());

	}
}
