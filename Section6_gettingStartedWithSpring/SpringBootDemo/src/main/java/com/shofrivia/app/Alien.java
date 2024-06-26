package com.shofrivia.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// This is a bean
// It is managed by Spring
// It is created in the Spring container
// It is injected with dependencies
// It is retrieved from the Spring container
// The component annotation is used to qualify the class as a bean
// The class is then managed by Spring, created, and injected with dependencies
@Component
public class Alien {
    // Need to use the @Autowired annotation to inject the dependency
    // The dependency is the Laptop class
    // The Laptop class is a bean
    // The Laptop class is managed by Spring

    // Wiring is the process of injecting the dependency
    // Will wire the Laptop class to the Alien class
    // Spring will know that the Alien class needs the Laptop class
    // YOu can have multiple dependencies
    @Autowired
    Laptop laptop;

    public void code()
    {
        laptop.compile();
        System.out.println("Coding");
    }
}
