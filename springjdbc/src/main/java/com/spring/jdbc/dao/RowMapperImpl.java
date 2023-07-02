package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.spring.jdbc.entities.Student;

public class RowMapperImpl implements org.springframework.jdbc.core.RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std = new Student();
		
		std.setId(rs.getInt(1));
		std.setName(rs.getString(2));
		std.setCity(rs.getString(3));
		
		return std;
	}
	

}
