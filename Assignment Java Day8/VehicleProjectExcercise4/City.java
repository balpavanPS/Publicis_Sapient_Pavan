package com.pavan.vehicle;

public class City {

	public static void main(String[] args) {
		Truck truck = new Truck("Red",6,"T8","Truck");
		truck.Display();
		Bus bus=new Bus("Blue",8,"B4","Bus");
		bus.Display();
		Car car=new Car("Green",4,"C8","Car");
		car.Display();

	}

}
