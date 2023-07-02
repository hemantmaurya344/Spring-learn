package com.springCore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	// property
	@Autowired
	@Qualifier("add")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	//setter 
//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setter");
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor
//	@Autowired
	public Student(Address address) {
		super();
		System.out.println("Constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
}
