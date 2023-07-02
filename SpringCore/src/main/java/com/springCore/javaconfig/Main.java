package com.springCore.javaconfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/autowire/annotation/autoconfig.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student std1 =  context.getBean("std", Student.class);
		
		System.out.println(std1);
	}
}
