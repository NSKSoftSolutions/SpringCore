package com.infosys.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infosys.domain.Movie;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("configurations/springconfig.xml");
		Movie movie = (Movie) context.getBean("movie");
		System.out.println("Movie Name=" + movie.getMoveName());
		System.out.println("Rating=" + movie.getRating());
	}
}
