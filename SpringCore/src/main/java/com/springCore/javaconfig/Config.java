package com.springCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	private String Street = "2nd Street";
	private String city = "delhi";
	
	@Bean
	public Address getAddress() {
		return new Address(Street,city);
	}
	
	@Bean(name="std")
	public Student getStudent() {
		return new Student(getAddress());
	}
}
