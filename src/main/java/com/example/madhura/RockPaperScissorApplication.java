package com.example.madhura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RockPaperScissorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RockPaperScissorApplication.class, args);
	}

	// this is the line where the container is initialized where the objects of classes are created
	// it returns the objects of Configurable application context which points to all newly created objs
	// only those objects are created which has @component annotation on class.the annotation creates a bean



}
