package com.example.RestSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.RestSample"})
public class RestSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSampleApplication.class, args);
	}

}
