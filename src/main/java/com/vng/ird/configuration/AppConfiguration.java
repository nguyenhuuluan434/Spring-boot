package com.vng.ird.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

/*@Configuration
@EnableAutoConfiguration*/
@PropertySource(value= "config/app.properties", ignoreResourceNotFound=true)
@Service
public class AppConfiguration {

/*	@Bean
	public PropertyPlaceholderConfigurer propertyConfigurer() throws Exception {
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		URL url = new File("config/app.properties").toURI().toURL();
		UrlResource resource = new UrlResource(url);
		ppc.setLocations(resource);
		return ppc;
	}*/

	@Value("{name:missing name}")
	private String name;

}
