package com.nsksoft.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsksoft.domain.Clothes;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("configuratiosn/springconfig.xml");
		Clothes clothes = (Clothes) context.getBean("clothes");
		System.out.println("Type:" + clothes.getTypesOfCloth());
		System.out.println("Manufatured By:" + clothes.getMadeBy());
		System.out.println("Size:" + clothes.getSize());
		System.out.println("Price:" + clothes.getPrice());

	}
}
