package com.etiennek.samples.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootWebSampleApplication {
	
	static final String MESSAGE = "Hello world!";

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebSampleApplication.class, args);
	}
	
	@RequestMapping
	public String home() {
		return MESSAGE;
	}
}
