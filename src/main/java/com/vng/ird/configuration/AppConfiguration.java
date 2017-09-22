package com.vng.ird.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
/*@PropertySources({ @PropertySource(value = "file:./config/app.properties", ignoreResourceNotFound = true),
		@PropertySource(value = "file:./config/databases.properties", ignoreResourceNotFound = true) })*/
@ComponentScan(basePackages = { "com.vng.ird" })
public class AppConfiguration {

	@Value("${app.name}")
	public String name;

	@Value("${app.hello.message}")
	public String helloMessage;

}
