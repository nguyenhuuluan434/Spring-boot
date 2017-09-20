package com.vng.ird.configuration;

import java.io.File;
import java.net.URL;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.UrlResource;

@Configuration
@EnableAutoConfiguration
public class AppConfiguration {

	@Bean
	public PropertyPlaceholderConfigurer propertyConfigurer() throws Exception {
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		URL url = new File("config/app.properties").toURI().toURL();
		UrlResource resource = new UrlResource(url);
		ppc.setLocations(resource);
		return ppc;
	}
}
