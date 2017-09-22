package com.vng.ird.configuration;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ConfigurationProperties(prefix="foo")
/*
 * @PropertySources({ @PropertySource(value = "file:./config/app.properties",
 * ignoreResourceNotFound = true),
 * 
 * @PropertySource(value = "file:./config/databases.properties",
 * ignoreResourceNotFound = true) })
 */
@ComponentScan(basePackages = { "com.vng.ird" })
public class AppConfiguration {

	@Value("${app.name}")
	public String name;

	@Value("${app.hello.message}")
	public String helloMessage;

	@Value("${foo.security.roles[1]}")
	public String roles;
	
	@Min(10)
	@Max(123)
	@Value("${app.remote-address}")
	public String remote;
	

}
