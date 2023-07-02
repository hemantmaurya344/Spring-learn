package com.spring.jdbc.annotation;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class Config {
	
	@Bean("dsource")
	public DataSource getDataSource() {
		DriverManagerDataSource dsource = new DriverManagerDataSource();
		dsource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dsource.setUrl("jdbc:mysql://localhost:3306/student");
		dsource.setUsername("root");
		dsource.setPassword("root");
		return dsource;
	}
	
	@Bean("JdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate JdbcTemplate = new JdbcTemplate();
		JdbcTemplate.setDataSource(getDataSource());
		return JdbcTemplate;
	}
	
		
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
	}
	
// 	we can use autowired here
//	use @Component to which class you want to create bean and use @Component-scan in config file 
//	and add autowired on setter or property or constructor
	
}
