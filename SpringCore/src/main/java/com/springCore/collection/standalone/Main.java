package com.springCore.collection.standalone;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/collection/standalone/standalonconfig.xml");
		
		Person p1 = context.getBean("p1",Person.class);
		
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		
		Person p2 = context.getBean("p2",Person.class);
		
		System.out.println(p2);
		System.out.println(p1.getFriends().getClass().getName());
		
	}
}
