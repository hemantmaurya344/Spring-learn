package com.springCore.collection.standalone;

import java.util.List;

public class Person {
	private List<String> Friends;

	public List<String> getFriends() {
		return Friends;
	}

	public void setFriends(List<String> friends) {
		Friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=]"+ Friends + "]";
	}
	
	
}
