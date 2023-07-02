package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		//insert 
        String query = "insert into student(id,name,city) values(?,?,?)";
        
        return this.jdbcTemplate.update(query,student.getId(), student.getName(),student.getCity());
	}

	public int update(Student student) {
		String query = "update student set name=?, city=? where id=?";
		
		return this.jdbcTemplate.update(query, student.getName(),student.getCity(),student.getId());
	}

	public int delete(Student student) {
		String query = "delete from student where id=?";
		
		return this.jdbcTemplate.update(query,student.getId());
	}

	public Student getStudent(int id) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowmap = new RowMapperImpl();
		
		return this.jdbcTemplate.queryForObject(query, rowmap , id);
	}

	// selecting all data 
	public List<Student> getAllStudent() {
		String query = "select * from student";
		
		return this.jdbcTemplate.query(query, new RowMapperImpl());
	}

}
