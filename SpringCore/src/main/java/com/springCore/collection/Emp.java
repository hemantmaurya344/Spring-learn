package com.springCore.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> contact;
	private Set<String> address;
	private Map<String, String> courses;
	private Properties office;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, List<String> contact, Set<String> address, Map<String, String> courses, Properties office) {
		super();
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.courses = courses;
		this.office = office;
	}

	public Properties getOffice() {
		return office;
	}

	public void setOffice(Properties office) {
		this.office = office;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getContact() {
		return contact;
	}
	public void setContact(List<String> contact) {
		this.contact = contact;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", contact=" + contact + ", address=" + address + ", courses=" + courses
				+ ", office=" + office + "]";
	}
}

