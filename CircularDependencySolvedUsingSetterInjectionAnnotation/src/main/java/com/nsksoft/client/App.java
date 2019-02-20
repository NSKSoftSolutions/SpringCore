package com.nsksoft.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configuratiosns.SpringConfigurations;
import com.nsksoft.beans.Actor;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurations.class);
		Actor actor = context.getBean(Actor.class);
		      actor.actorDetailss();
		      
		      
	}
}
