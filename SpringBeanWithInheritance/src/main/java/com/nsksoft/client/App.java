package com.nsksoft.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nsksoft.domain.Mobile;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Scanner s = new Scanner(System.in);
		System.out.println("1. Iphone 7");
		System.out.println("2. Samsung Note5");
		System.out.println("choose the Mobile from MobileShop");
		String choice = s.next();
		Mobile mobile = (Mobile) context.getBean(choice);
		System.out.println("******************************************************************");

		System.out.println("Mobile Name:" + mobile.getMobileName());
		System.out.println("Manufatured By:" + mobile.getManufacturedBy());
		System.out.println("Price:" + mobile.getPrice());
		System.out.println("OS:" + mobile.getOperatingSystem());

		System.out.println("******************************************************************");

	}
}
