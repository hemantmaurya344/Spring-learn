package com.springCore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean3 {
	private String name;

	public Bean3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean3(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Annotation is used in Bean3 [name=" + name + "]";
	}
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destoryed");
	}
}
