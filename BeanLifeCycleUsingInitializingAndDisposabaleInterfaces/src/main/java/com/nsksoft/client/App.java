package com.nsksoft.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsksoft.domain.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Employee employee = context.getBean(Employee.class);
		context.registerShutdownHook();
	}
}
