package com.polarbookshop.catalogservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;


/*
 * 
 * Main class
 * 
 */

@SpringBootApplication
@ConfigurationPropertiesScan
public class CatalogServiceApplication {

	@Autowired
	private Environment environment;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CatalogServiceApplication.class, args);
		System.out.println(applicationContext.getBean(CatalogServiceApplication.class).environment.getProperty("server.port"));
	}

	@Bean
	ApplicationRunner applicationRunner(Environment environment) {
		return args -> {
			System.out.println("applicationRunner: " + environment.getProperty("server.port"));
			System.out.println("applicationRunner: " + environment.getProperty("polar.greeting"));
		};
	}
}
