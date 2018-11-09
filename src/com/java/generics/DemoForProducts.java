package com.java.generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoForProducts {

	public static void main(String[] args) {

		Products<String, String> listOfProduct = new Products<>();
		listOfProduct.setItemOne("Some Products");
		listOfProduct.setItemTwo("Mobile Products");
		System.out.println(listOfProduct.getItemOne());
		System.out.println(listOfProduct.getItemTwo());

		Products<Integer, Integer> listOfProductNum = new Products<>();
		listOfProductNum.setItemOne(23);
		listOfProductNum.setItemTwo(50);
		System.out.println(listOfProductNum);

		getUnionOfSetValues();

	}

	private static <E> Set<E> unionOfSets(Set<E> mySetOne, Set<E> mySetTwo) {

		Set<E> resultSet = new TreeSet<>();
		resultSet.addAll(mySetOne);
		resultSet.addAll(mySetTwo);

		return resultSet;

	}

	public static void getUnionOfSetValues() {

		Set<String> mySet1 = new HashSet<>();
		mySet1.add("DC");
		mySet1.add("VA");
		mySet1.add("MD");

		Set<String> mySet2 = new TreeSet<>();
		mySet2.add("DC");
		mySet2.add("VA");
		mySet2.add("MD");
		mySet2.add("PA");

		Set<String> reSet = unionOfSets(mySet1, mySet2);
		System.out.println(reSet);
	}
}
