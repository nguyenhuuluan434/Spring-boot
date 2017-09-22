package com.vng.ird.configuration;

import java.io.IOException;

import org.springframework.boot.env.PropertySourcesLoader;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

@Configuration
public class AppConfigurationWithBeans {

	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() throws IOException {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		MutablePropertySources propertySources = new MutablePropertySources();

		//Load yaml resource
		Resource resourceYaml = new DefaultResourceLoader().getResource("file:config/app.yml");
		YamlPropertySourceLoader sourceYamlLoader = new YamlPropertySourceLoader();
		PropertySource<?> yamlProperties = sourceYamlLoader.load("resourceYaml", resourceYaml, null);
//Load properties resource
		Resource resourceProperties = new DefaultResourceLoader().getResource("file:config/app.properties");
		PropertySourcesLoader sourcePropertiesLoader = new PropertySourcesLoader();
		PropertySource<?> propertyProperties = sourcePropertiesLoader.load(resourceProperties, "resourceProperties",
				null);

		//Add to PropertySourcesPlaceholderConfigurer
		propertySources.addFirst(yamlProperties);
		// propertySources.addBefore("resourceYaml", propertyProperties);
		propertySources.addAfter("resourceYaml", propertyProperties);
		
		configurer.setPropertySources(propertySources);
		return configurer;
	}
}
