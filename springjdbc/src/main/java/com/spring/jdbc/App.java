package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.annotation.Config;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
    public static void main( String[] args ){
       
//        ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
        
        StudentDao studentDao = con.getBean("studentDao",StudentDao.class);
        	
        //insert
        Student std1 = new Student();
        std1.setName("asd");
        std1.setCity("asd");
        int u = studentDao.insert(std1);
        
        	// we can do this via beans also by creating bean in config file
//        int u = studentDao.insert(con.getBean("std1",Student.class));
        
        //update
//        Student std2 = new Student();
//        std2.setName("sada");
//        std2.setCity("Bhopal");
//        std2.setId(4);
//        int u = studentDao.update(std2);
        
//        int u = studentDao.update(con.getBean("std2",Student.class));
        
        //delete
//        Student std3 = new Student();
//        std3.setId(2);
//        int u = studentDao.delete(std3);
         
//        	int u = studentDao.delete(con.getBean("std3",Student.class));
//        Student u = studentDao.getStudent(4);
        
        
        // geting all the data
        List<Student> student = studentDao.getAllStudent();
        
        student.forEach(e -> {
        	System.out.println(e);
        });
    }
}
