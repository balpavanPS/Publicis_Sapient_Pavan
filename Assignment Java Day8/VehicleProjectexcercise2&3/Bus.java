package com.pavan.vehicle;

public class Bus extends Vehicle {
	public Bus(String color,int noofwheels,String model) {
		super(color,noofwheels,model);
	}
	public void showDetails() {
		System.out.println("The vehicle is bus and bus is "+getColor()+" in color.");
		System.out.println("The vehicle is bus and bus has "+getNoofwheels()+" wheels.");
		System.out.println("The vehicle is bus and bus is "+getModel()+" model.");
	}

}
