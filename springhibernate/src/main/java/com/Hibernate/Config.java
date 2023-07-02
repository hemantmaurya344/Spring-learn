package com.Hibernate;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.Hibernate.entities.Student;
import com.Hibernatedao.StudentDao;
import com.Hibernatedao.StudentDaoImpl;
import com.mysql.cj.xdevapi.SessionFactory;

@Configuration
@ComponentScan(basePackages = { "com.springcore.Hibernatedao" })
public class Config {

	@Bean("dsource")
	public DataSource getDataSource() {
		DriverManagerDataSource dsource = new DriverManagerDataSource();
		dsource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dsource.setUrl("jdbc:mysql://localhost:3306/springhibernate");
		dsource.setUsername("root");
		dsource.setPassword("root");
		return dsource;
	}

	@Bean("factory")
	public LocalSessionFactoryBean getLocalSession() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(getDataSource());

		Properties prop = new Properties();
		prop.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		prop.put("hibernate.show_sql", true);
		prop.put("hibernate.hbm2ddl", "update");

		lsfb.setHibernateProperties(prop);

		lsfb.setAnnotatedClasses(Student.class);

		return lsfb;
	}

//	@Bean("template")
//	public HibernateTemplate gettemplate()SessionFactory sessionFactory {
//		HibernateTemplate template = new HibernateTemplate(sessionFactory);
//		template.setSessionFactory(getLocalSession());
//		
//		
//	}
	
//	public HibernateTransactionManager getTransaction() {
//		SessionFactory fac = new SessionFactory();
//		
//		fac.s
//	}

//	public StudentDao getDao() {
//		StudentDaoImpl stdimpl = new StudentDaoImpl();
//		stdimpl.
//	}

}
