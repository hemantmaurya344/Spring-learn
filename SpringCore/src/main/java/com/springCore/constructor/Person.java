package com.springCore.constructor;

public class Person {
	private String name;
	private int pid;
	private Certi cert;
	
	public Person(String name, int pid, Certi cert) {
		super();
		this.name = name;
		this.pid = pid;
		this.cert = cert;
	}

	@Override
	public String toString() {
		return this.name+" : " + this.pid +" {"+this.cert+"}";
	}
	
}
