package com.java.oop;

public class Constructors {
	
	// it's type of method.
	// it has a same name as class
	// Constructors are always public 
	// They don't have return type.
	// any class java provide default constructor 
	// you can multiple constructors in one class
	
	public Constructors() {
		// no-arg cont
		System.out.println("this is from cont class with no arg");
	}
	
	int numOne;
	int numTwo;
	String str;
	
	public void getAll() {
		
	}
	
	public Constructors (int numOne, int numTwo, String str) {
		System.out.println("this is from cont with args");
		
	}
	

}
