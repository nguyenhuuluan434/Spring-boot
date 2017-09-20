package com.vng.ird;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * @EnableAutoConfiguration
 * 
 * 
 * @SpringBootApplication
 * */

@ComponentScan
public class Example {

	public static void main(String[] args) {
		// SpringApplication.run(Example.class, args);
		SpringApplication app = new SpringApplication(Example.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}
}
