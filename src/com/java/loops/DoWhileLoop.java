package com.java.loops;

public class DoWhileLoop {

	/*
	 * do{ Statement(s); }while (conditions);
	 * 
	 */
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(i);
			i--;
		} while (i > 10);

		double[] arr = { 12.99, 45.67, 89.67 };
		double sum = 0;
		for (double m : arr) {
			sum += m;
		}
		System.out.println(sum);

	}

}
