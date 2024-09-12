package com.tech.springBootFirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
//		System.out.println("Hello Spring Boot !!!");

		Alien a = context.getBean(Alien.class);
		a.code();

//		Alien a1 = context.getBean(Alien.class);
//		a1.code();
//
//		Alien a2 = context.getBean(Alien.class);
//		a2.code();



	}

}
