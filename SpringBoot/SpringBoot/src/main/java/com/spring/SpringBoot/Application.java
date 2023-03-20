package com.spring.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		Product p1 = context.getBean(Product.class);
		System.out.println(p1);
		
		Product p2 = context.getBean(Product.class);
		System.out.println(p2);
	}
}