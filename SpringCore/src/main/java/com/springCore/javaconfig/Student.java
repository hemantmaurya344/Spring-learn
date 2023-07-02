package com.springCore.javaconfig;


public class Student {

	private Address address;

	public Address getAddress() {
		return address;
	}
	

	public void setAddress(Address address) {
		System.out.println("Setter");
		this.address = address;
	}

	

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
