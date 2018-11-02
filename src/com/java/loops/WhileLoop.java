package com.java.loops;

public class WhileLoop {
	
	/*
	 while (condition){
	 	Statement(s);
	 }
	 
	 */
	
	public static void main(String[] args) {
//		int i = 0;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		
//		int arr[] = {2,11,56,67,78};
//		int j = 0;
//		while(j < arr.length) {
//			System.out.print(arr[j] + " ");
//			j++;
//		}
		
		//0 1 1 2 3 5 8 13
		int count = 8;
		int numOne = 0;
		int numTwo = 1;
		int k = 1;
		while (k <= count) {
			System.out.println(numOne +  " ");
			int SumOfTwo = numOne + numTwo;
			numOne = numTwo;
			numTwo = SumOfTwo;
			k++;
		}
		
		
		
	}

}
