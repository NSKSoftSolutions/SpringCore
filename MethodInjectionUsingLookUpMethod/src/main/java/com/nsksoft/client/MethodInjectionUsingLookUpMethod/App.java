package com.nsksoft.client.MethodInjectionUsingLookUpMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configurations.SpringConfigurations;
import com.nsksoft.domain.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurations.class);
		Product product = context.getBean(Product.class);
		System.out.println("Product Name:" + product.getProductName());
		System.out.println(product.getOrderDetails());
		System.out.println("Quanity=" + product.getOrderDetails().getQuantity());

		System.out.println("*************************************************");
		System.out.println(product.getOrderDetails());
		System.out.println("Quanity=" + product.getOrderDetails().getQuantity());
	}
}
