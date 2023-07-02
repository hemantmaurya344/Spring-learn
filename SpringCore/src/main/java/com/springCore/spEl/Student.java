package com.springCore.spEl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("#{ new java.lang.String('Hemant Maurya')}")
	private String studentName;
	@Value("Delhi")
	private String city;
	@Value("#{ T(java.lang.Math).PI}")
	private String Pi;
	
	
	public String getSqrt() {
		return Pi;
	}
	public void setSqrt(String sqrt) {
		this.Pi = sqrt;
	}
	@Value("#{temp}")
	private List<String> add;
	public List<String> getAdd() {
		return add;
	}
	public void setAdd(List<String> add) {
		this.add = add;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", sqrt=" + Pi + ", add=" + add + "]";
	}
	
}
