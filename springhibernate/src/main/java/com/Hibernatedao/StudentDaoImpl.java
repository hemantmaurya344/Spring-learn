package com.Hibernatedao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Hibernate.entities.Student;

import jakarta.transaction.Transactional;


public class StudentDaoImpl implements StudentDao {

	public HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {		
		return (Integer) this.hibernateTemplate.save(student);
	}

	public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
