package com.java.basics;

public class BasicArithmetic {
	/*
	 * Basic arithmetic operators are: +, -, *, /, %
	 */

	public static void main(String args[]) {
		int num1 = 100;
		int num2 = 20;

		System.out.println("num1 + num2: " + (num1 + num2));
		System.out.println("num1 - num2: " + (num1 - num2));
		System.out.println("num1 * num2: " + (num1 * num2));
		System.out.println("num1 / num2: " + (num1 / num2));
		System.out.println("num1 % num2: " + (num1 % num2));

		//Converting into values into float 
		int totalOfAdd = num1 + num2;
		float sumOfTotal = (float) totalOfAdd;
		System.out.println(sumOfTotal);
	}

}
