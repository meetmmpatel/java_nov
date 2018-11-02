package com.java.basics;

public class TernaryOperator {
	
	// variable num1 = (expression) ? value if true : value if false
	
	public static void main(String[] args) {
		int num1;
		int num2;
		
		num1 = 25;
		
		num2 = (num1 != 10) ? 100 : 200;
		System.out.println(num2);
		
		
		// num1 = 80 num2 = 100 = num3 = 10
		int num3 = 0;
		int temp = (num1 > num2 ) ? num1 : num2;
		int temp2 = (num3 > temp) ? num3 : temp;
		
	}

}
