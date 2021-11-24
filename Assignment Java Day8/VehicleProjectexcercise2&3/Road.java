package com.pavan.vehicle;

public class Road {

	public static void main(String[] args) {
		Truck truck = new Truck("Red",6,"T8");
		truck.showDetails();
		Bus bus=new Bus("Blue",8,"B4");
		bus.showDetails();
		Car car=new Car("Green",4,"C8");
		car.showDetails();

	}

}
