package com.ashifshadab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashifshadab.config.SampleConfig1;
import com.ashifshadab.config.SampleConfig2;

@SpringBootApplication
public class PropertySourceAnnotationExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(PropertySourceAnnotationExampleApplication.class, args);

		SampleConfig1 sampleConfig1 = applicationContext.getBean(SampleConfig1.class);

		System.out.println("Value of sample1.properties'Country is " + sampleConfig1.getPropertyValue("country"));

		System.out.println("Value of sample1.properties'Population is " + sampleConfig1.getPropertyValue("Population"));

		SampleConfig2 sampleConfig2 = applicationContext.getBean(SampleConfig2.class);

		System.out.println("Book " + sampleConfig2.getProperty1() + "\t" + " author " + sampleConfig2.getProperty2()
		+ "\t"+ " country " + sampleConfig2.getProperty3() + "\t" + " Population " + sampleConfig2.getProperty4());

	}

}
