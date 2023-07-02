package com.Hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Hibernate.entities.Student;
import com.Hibernatedao.StudentDao;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
		StudentDao stddao = con.getBean("studentdaoimpl", StudentDao.class);
		
		Student student =  new Student("Hemant","Delhi");
		
		System.out.println(stddao.insert(student));
		
		
	}
}
