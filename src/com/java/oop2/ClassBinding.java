package com.java.oop2;

public class ClassBinding extends Demo {
	public static void walk() {
		System.out.println("child class walk method");
	}

	public void talk() {
		super.talk();
		System.out.println("this is child class talk method");

	}
	
	public void getInfo() {
		
	}

	public static void main(String[] args) {
		Demo obj = new ClassBinding();
		
		obj.walk();
		obj.talk();
		

		Demo obj2 = new Demo();
		obj2.walk();

	}

}

class Demo {

	public static void walk() {
		System.out.println("Super class walk method");
	}

	public void talk() {
		System.out.println("This is demo class talk method");
	}

}
