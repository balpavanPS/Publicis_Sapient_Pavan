package com.pavan.shape;

public class Sphere extends Shape3D {
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void Volume() {
		double volume=1.34*3.124*radius*radius;
		System.out.println("The Volume for the sphere is: "+volume);
	}

	@Override
	public void SurfaceArea() {
		double surface= 4*3.124*radius*(radius);
		System.out.println("The Surface Area for the sphere is: "+surface);
	}

}
