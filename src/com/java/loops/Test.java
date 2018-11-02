package com.java.loops;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int arr[] = {1,4,17,7,25,3,100};
		
		int k = 3;
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for (int i = arr.length -1; i > arr.length - 4; i--) {
			System.out.println("Larget value" + arr[i]);
		}
		
		
		
		
	}

}
