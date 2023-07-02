package com.springCore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean2 implements InitializingBean,DisposableBean {
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean2(String name) {
		super();
		this.name = name;
	}

	public Bean2() {
		super();
	}

	@Override
	public String toString() {
		return "Interface is used in Bean2 [name=" + name + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}
	
}
