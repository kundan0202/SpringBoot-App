package com.webproject.SpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(SpringBootAppApplication.class, args);
		run.close();
		
		//suman code chnages
		int i=10;
	}

}
