package com.vng.ird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

import com.vng.ird.configuration.AppConfiguration;

/*
 * @EnableAutoConfiguration
 * 
 * 
 * @SpringBootApplication
 * */

@ComponentScan
public class Example {

	@Autowired
	private AppConfiguration appConfig;
	
	public static void main(String[] args) {
		// SpringApplication.run(Example.class, args);
		SpringApplication app = new SpringApplication(AppConfiguration.class);
		System.out.println();
		app.setBannerMode(Mode.OFF);
		app.run(args);
		
	}
}
