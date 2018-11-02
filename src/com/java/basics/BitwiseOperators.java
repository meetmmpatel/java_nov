package com.java.basics;

public class BitwiseOperators {

	// There are six bitwise Operators: &, |, ^, ~, <<, >>

	public static void main(String[] args) {
		int num1 = 11; //00001011;
		int num2 = 22; //00010110;
		int result;
		
		// &
		result = num1 & num2;
		System.out.println(result);
		
		//|
		result = num1 | num2; //00011111
		System.out.println(result);
		
		result = num1 ^ num2;  //00011101
		System.out.println(result);
		
		result = ~num1;
		System.out.println(result);
		
		result = num1 << 2;  // 00101100
		System.out.println(result);
	}

}
