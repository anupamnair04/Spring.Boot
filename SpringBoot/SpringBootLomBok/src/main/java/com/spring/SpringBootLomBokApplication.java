package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootLomBokApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(SpringBootLomBokApplication.class, args);
		Product p=context.getBean(Product.class);
		p.setCode(777);
		p.setName("abc");
		p.setPrice(67666);

		System.out.println(p.toString());
		}
}