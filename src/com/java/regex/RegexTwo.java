package com.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegexTwo {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("test");
		names.add("Test123@");
		names.add("test123");
		
		
		String regex = "^[a-zA-Z0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		
		for(String name : names) {
			Matcher matcher = pattern.matcher(name);
			System.out.println(matcher.matches());
		}
		
		
	}

}
