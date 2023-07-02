package com.springCore.autowire.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/autowire/annotation/autoconfig.xml");
		
		Student std1 =  context.getBean("std1", Student.class);
		
		System.out.println(std1);
	}
}
