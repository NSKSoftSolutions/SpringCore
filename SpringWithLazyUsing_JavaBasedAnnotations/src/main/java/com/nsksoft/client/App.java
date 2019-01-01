package com.nsksoft.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nsksoft.configurations.SpringConfiguration;
import com.nsksoft.domain.Movie;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Movie movie = context.getBean(Movie.class);
		System.out.println("Latest Movie=" + movie.getMoveName());
		System.out.println("Rating=" + movie.getRating());
	}
}
