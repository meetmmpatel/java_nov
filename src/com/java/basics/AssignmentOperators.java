package com.java.basics;

public class AssignmentOperators {

	// Assignments operators in java are: =, +=, -=, *=, /=, %=

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 30;

		System.out.println(num2);
		num2 = num1;
		System.out.println("= Output: " + num2);

		num2 += num1;
		System.out.println("+= Output: " + num2);

		num2 -= num1;
		System.out.println("-= Output: " + num2);

		num2 *= num1;
		System.out.println("*= Output: " + num2);

		num2 /= num1;
		System.out.println("/= Output: " + num2);

		num2 %= num1;
		System.out.println("%= Output: " + num2);

	}

}
