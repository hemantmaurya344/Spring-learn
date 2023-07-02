package com.springCore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/reference/refconfig.xml");
		A a = (A) context.getBean("aref");
		
		System.out.println(a);
	}
}
