package com.ashifshadab.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(value = { @PropertySource(value = { "classpath:sample1.properties" }),
		@PropertySource(value = { "classpath:sample2.properties" }) })
public class SampleConfig2 {

	@Value(value = "${book}")
	private String property1;

	@Value(value = "${author}")
	private String property2;

	@Value(value = "${country}")
	private String property3;

	@Value(value = "${Population}")
	private String property4;

	public String getProperty1() {
		return property1;
	}

	public String getProperty2() {
		return property2;
	}

	public String getProperty3() {
		return property3;
	}

	public String getProperty4() {
		return property4;
	}
	
	

}
