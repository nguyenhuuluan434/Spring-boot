package com.vng.ird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vng.ird.configuration.AppConfiguration;

@SpringBootApplication
public class Example {

	public static void main(String[] args) {
		// SpringApplication.run(Example.class, args);
		SpringApplication app = new SpringApplication(AppConfiguration.class);
		app.run(args);
	}
}
