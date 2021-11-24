package com.pavan.shape;

public class Shape3DMain {

	public static void main(String[] args) {
		Cylinder cylinder=new Cylinder();
		cylinder.setRadius(10);
		cylinder.setHeight(5);
		cylinder.Volume();
		cylinder.SurfaceArea();
		
		Cube cube=new Cube();
		cube.setSide(2);
		cube.Volume();
		cube.SurfaceArea();
		
		Sphere sphere=new Sphere();
		sphere.setRadius(3);
		sphere.Volume();
		sphere.SurfaceArea();

	}

}
