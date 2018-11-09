package com.java.enumdemo;

public class EnumDemo {
	
	public static void main(String[] args) {
		Directions dir = Directions.NORTH;
		
		if (dir == Directions.EAST) {
			System.out.println("Direction is EAST");
		}else if(dir == Directions.WEST) {
			System.out.println("Directions is WEST");
		}else if (dir == Directions.NORTH) {
			System.out.println("Directions is NORTH");
		}else {
			System.out.println("Direction is SOUTH");
		}
		
		
		
	}

}

enum Directions {
	EAST, WEST, NORTH, SOUTH

}
