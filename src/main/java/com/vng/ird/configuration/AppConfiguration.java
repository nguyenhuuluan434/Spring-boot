package com.vng.ird.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@EnableAutoConfiguration
@PropertySources({ @PropertySource(value = "file:./config/app.properties"),
		@PropertySource(value = "file:./config/databases.properties") })
@ComponentScan(basePackages = { "com.vng.ird" })
public class AppConfiguration {

	/*
	 * // properties file
	 * 
	 * @Bean public PropertyPlaceholderConfigurer propertyConfigurer() throws
	 * Exception { PropertyPlaceholderConfigurer ppc = new
	 * PropertyPlaceholderConfigurer(); URL url = new
	 * File("config/app.properties").toURI().toURL();
	 * System.out.println(url.getPath()); UrlResource resource = new
	 * UrlResource(url); ppc.setLocations(resource); return ppc; }
	 */

	@Value("${app.name}")
	public String name;

	@Value("${app.hello.message}")
	public String helloMessage;

}
