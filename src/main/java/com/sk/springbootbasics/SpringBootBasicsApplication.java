package com.sk.springbootbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.sk.springbootbasics.*")
public class SpringBootBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicsApplication.class, args);
	}

	
	
}
