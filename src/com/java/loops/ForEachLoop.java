package com.java.loops;

public class ForEachLoop {

	public static void main(String[] args) {

		// print fibonacci using loop 0, 1, 1, 2, 3, 5, 8, 13, 21,

		int count = 9;
		int num1 = 0;
		int num2 = 1;

		for (int i = 1; i <= count; ++i) {
			System.out.println(num1);
			int sumOfTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfTwo;
		}

	}

}
