package com.springCore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/collection/collectionConfig.xml");
		Emp emp1 = (Emp)context.getBean("emp1");
		
		System.out.println(emp1);
	}
}
