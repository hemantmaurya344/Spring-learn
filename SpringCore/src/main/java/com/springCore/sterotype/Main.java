package com.springCore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springCore/sterotype/steroconfig.xml");
		
		Student student = con.getBean("ob",Student.class);
		Student student1 = con.getBean("ob",Student.class);
		
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
	}
	
}
