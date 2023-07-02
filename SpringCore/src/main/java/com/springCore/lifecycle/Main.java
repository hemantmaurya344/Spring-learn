package com.springCore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifecycle/lifecycleconfigg.xml");
		 
//		Bean b1 = (Bean) context.getBean("b1"); 
//		System.out.println(b1);
//		
		context.registerShutdownHook();
//		
//		System.out.println("-------------");
//		
//		Bean2 b2 = (Bean2) context.getBean("b2");
//		
//		System.out.println(b2);
	
		Bean3 b3 = (Bean3) context.getBean("b3");
		
		System.out.println(b3);
	}	
}
