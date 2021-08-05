package com.ashifshadab.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:sample1.properties")
public class SampleConfig1 {
	
	@Autowired
	private Environment environment;
		
	public  String getPropertyValue(String propertyKey){
		return  environment.getProperty(propertyKey);
	}

}
