package com.java.oop;

public class HelloContructors {
	
	String name;

	public HelloContructors() {
		super();
	}

	public HelloContructors(String foo) {
	
		System.out.println(foo);
	}

	@Override
	public String toString() {
		return "HelloContructors [name=" + name + "]";
	}
	
	

}
