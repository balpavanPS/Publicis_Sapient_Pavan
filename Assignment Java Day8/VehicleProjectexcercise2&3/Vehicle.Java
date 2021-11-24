package com.pavan.vehicle;

public class Vehicle {
	private int noofwheels;
	private String color,model;
	public Vehicle(String color,int noofwheels,String model) {
		this.color=color;
		this.model=model;
		this.noofwheels=noofwheels;
	}
	public int getNoofwheels() {
		return noofwheels;
	}
	public String getColor() {
		return color;
	}
	public String getModel() {
		return model;
	}
	

}
