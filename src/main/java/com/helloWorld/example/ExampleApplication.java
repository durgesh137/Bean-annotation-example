package com.helloWorld.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

	/**
	 * When spring runs, it first scans this class
	 * @return
	 */
	@Bean
	public  String basicMessage(){
		System.out.println("Inside basicMessage");
		return "Hello";
	}
}
