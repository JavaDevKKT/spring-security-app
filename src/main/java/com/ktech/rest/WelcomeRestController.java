package com.ktech.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot App";
	}

	@GetMapping("/home")
	public String home() {
		return "Welcome to home";
	}
}
