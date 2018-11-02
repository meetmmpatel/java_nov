package com.java.oop;

public class Lunch {
	
	String salad;
	String pitabread;
	String maincource;

	
	
	public Lunch(String salad, String pitabread, String maincource) {
	
		this.salad = salad;
		this.pitabread = pitabread;
		this.maincource = maincource;
	}
	
	
	
	public Lunch(String maincource) {
		super();
		this.maincource = maincource;
	}
	
	

	public Lunch(String salad, String pitabread) {
		super();
		this.salad = salad;
		this.pitabread = pitabread;
	}



	public void cooking() {
		
	}


	@Override
	public String toString() {
		return "Lunch [salad=" + salad + ", pitabread=" + pitabread + ", maincource=" + maincource + "]";
	}
	
	

}
