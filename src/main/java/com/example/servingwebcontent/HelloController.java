package com.example.servingwebcontent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		System.out.println("Greetings from Spring");

		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info("hello");
		logger.info("This is logger");

		return "Greetings from Spring Boot!";
	}

}
