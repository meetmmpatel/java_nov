package com.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListExample {

	/*
	 * [A, B, C, D] [A, B, C, D, A, A] [C, D, A, A] C D A A
	 */

	public static void main(String[] args) {
		// Create linked list
		LinkedList<String> linkedList = new LinkedList<>();

		// Add elements
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");

		System.out.println(linkedList);

		// Add elements at specified position
		linkedList.add(4, "A");
		linkedList.add(5, "A");

		System.out.println(linkedList);

		// Remove element
		linkedList.remove("A"); // removes A
		linkedList.remove(0); // removes B

		System.out.println(linkedList);

		// Iterate
		ListIterator<String> itrator = linkedList.listIterator();

		while (itrator.hasNext()) {
			System.out.println(itrator.next());
		}

		String[] str = { "A", "B", "C", "D" };
		System.out.println(Arrays.toString(str));
		LinkedList<String> listTwo = new LinkedList<>(Arrays.asList(str));
		System.out.println(listTwo);
		
		List<String> strList = new LinkedList<>(Arrays.asList("A","C","B","D"));
		System.out.println(strList);
		
		Collections.sort(strList);
		System.out.println(strList);
		
		Collections.sort(strList, Collections.reverseOrder());
//		Collections.reverse(strList);
		System.out.println(strList);
		

	}

}
