package com.pavan.shape;

public class Cube extends Shape3D {
	private int side;
	
	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public void Volume() {
		
		int volume = side*side*side;
		System.out.println("The Volume for the cube is: "+volume);
	}

	@Override
	public void SurfaceArea() {
		
		int surface= 6*side*side;
		System.out.println("The Surface Area for the cube is: "+surface);
	}

}
