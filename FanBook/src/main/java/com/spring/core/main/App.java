package com.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.bean.Post;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Object obj = context.getBean("post");
		Post p = (Post) obj;
		System.out.println(p.getPost_type());
		System.out.println(p.getPosted_from());
		System.out.println(p.getPosted_by());

		p.postDetails();
		
	}
}
