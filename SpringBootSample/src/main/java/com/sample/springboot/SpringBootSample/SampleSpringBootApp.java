package com.sample.springboot.SpringBootSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.sample.*")
@PropertySources({@PropertySource("classpath:application.properties"),
	@PropertySource("classpath:DBProperties.properties")
})
public class SampleSpringBootApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SampleSpringBootApp.class, args);
    }
    
}
