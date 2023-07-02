package com.springCore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/constructor/constructorinjection.xml");
			
		Person p1 = (Person) context.getBean("person1");
		
		System.out.println(p1);
					
	}
}
