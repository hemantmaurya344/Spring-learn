package com.springCore.lifecycle;

public class Bean {
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		System.out.println("price setted");
		this.price = price;
	}

	public Bean(float price) {
		super();
		this.price = price;
	}

	public Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bean [price=" + price + "]";
	} 
	
	public void init() {
		System.out.println("Init method");
	}
	public void destroy() {
		System.out.println("Destroy method");
	}
}
