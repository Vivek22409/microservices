package com.nagarro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class AggregatorServiceApplication implements CommandLineRunner {
	
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(AggregatorServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		System.out.println("*"+env.getRequiredProperty("JAVA_HOME"));
	}

}
