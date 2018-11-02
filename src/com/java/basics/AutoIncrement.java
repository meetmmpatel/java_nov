package com.java.basics;

public class AutoIncrement {

	// ++ or -- before or after the variables

	public static void main(String[] args) {

		int numOne = 123;
		int numTwo = 345;

		System.out.println(numOne++);
		System.out.println(numOne);

		numTwo--;
		System.out.println(numTwo);

		++numOne;
		System.out.println(numOne);

	}

}
