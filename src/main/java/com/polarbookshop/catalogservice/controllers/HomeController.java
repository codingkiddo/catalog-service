package com.polarbookshop.catalogservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polarbookshop.catalogservice.config.PolarProperties;

@RestController
public class HomeController {

	@Autowired
	private PolarProperties polarProperties;
	
	@GetMapping("/")
	public String getGreeting() {
		return polarProperties.getGreeting(); 
	}
}
