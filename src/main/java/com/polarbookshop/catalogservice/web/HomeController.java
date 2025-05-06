package com.polarbookshop.catalogservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polarbookshop.catalogservice.config.PolarProperties;

@RestController
public class HomeController {

	private final PolarProperties polarProperties;

	public HomeController(PolarProperties polarProperties) {
		this.polarProperties = polarProperties;
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Welcome to the book catalog!";
	}

	@GetMapping("/greeting")
	public String getGreeting() {
		return polarProperties.getGreeting();
	}
}
