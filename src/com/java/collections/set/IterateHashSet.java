package com.java.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IterateHashSet {

	public static void main(String[] args) {

		Set<String> hset = new HashSet<>();
		hset.add("Chaitanya");
		hset.add("Rahul");
		hset.add("Tim");
		hset.add("Rick");
		hset.add("Harry");

		// user itrator and for each loop and print every element.

		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (String it2 : hset) {
			System.out.println(it2);
		}

		Set<String> tset = new TreeSet<>(hset);
		System.out.println("Sorted: " + tset);

	}

}
