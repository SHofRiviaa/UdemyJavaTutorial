package com.shofrivia.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("Hello, Spring Boot!");

		// Spring is responsible for creating the object and managing the object
		// They're called beans

		// We want Spring to manage the object!
		// It will be created in the Spring container that is in the JVM
		// Spring container will manage the object's lifecycle
		// Spring container will inject the dependencies
		// Need to use application context to get the object
		//Alien alien = new Alien();
		//alien.code();

		// YOu don't want Spring to create all objects in your application
		// You want to create the objects that you need
		// To do that, you need to qualify the class as a bean
		// Need to use annotations on the class

		// Main is dependent on Alien
		// Alien is dependent on Laptop
		// but when you're using Alien in the main, you can use the context to get the Alien object
		// Everywhere else, you need to use Autowired and Component annotations

		// Many ways to configure application
		// 1. XML configuration
		// 2. Annotation-based configuration
		// 3. Java-based configuration

		Alien alien = context.getBean(Alien.class);
		alien.code();
	}

}
