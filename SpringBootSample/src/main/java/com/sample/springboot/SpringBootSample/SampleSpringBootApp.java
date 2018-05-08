package com.sample.springboot.SpringBootSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.sample.*")
public class SampleSpringBootApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SampleSpringBootApp.class, args);
    }
}
