package com.java.generics;

public class DemoForGenerics {

	public static void main(String[] args) {
		Product<String> productOne = new Product<String>("Product One has been created!");
		Product<Integer> productTwo = new Product<Integer>(12);
		System.out.println(productOne);
		System.out.println(productTwo);

		Test<Integer, String> testOne = new Test<Integer, String>(10, "TestOne");
		Test<String, String> testTwo = new Test<String, String>("TestTwo", "TestTwo");

		testOne.print();
		testTwo.print();

	}

}

class Product<T> {

	T obj;

	public Product(T obj) {
		super();
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Product [obj=" + obj + "]";
	}

}

class Test<T, U> {

	T obj1;
	U obj2;

	public Test(T obj1, U obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}

}