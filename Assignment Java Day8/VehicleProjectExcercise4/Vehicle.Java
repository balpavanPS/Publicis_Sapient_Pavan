package com.pavan.vehicle;

public class Vehicle {
	private int noofwheels;
	private String color,model,name;
	Vehicle(String color,int noofwheels,String model,String name) {
		this.color=color;
		this.model=model;
		this.noofwheels=noofwheels;
		this.name=name;
	}

	private String getName() {
		return name;
	}

	private int getNoofwheels() {
		return noofwheels;
	}
	private String getColor() {
		return color;
	}
	private String getModel() {
		return model;
	}
	public void Display() {
		System.out.println("The vehicle is"+getName()+" is "+getColor()+"in color.");
		System.out.println(" and "+getName()+ " has "+getNoofwheels()+" wheels.");
		System.out.println(" and "+getName()+" is "+getModel()+" model.");
	}
	

}
