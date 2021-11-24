package org.animals;

public class Elephant {
	private String color = "Grey";
	private int age = 50;
	private double weight = 900.75;
	public boolean isVegetarian() {
		boolean vegetarian=true;
		return vegetarian;
	}
	public boolean canClimb() {
		boolean climb=false;
		return climb;
	}
	public String Sound() {
		String sound="Elephant Truimph";
		return sound;
	}
	public void displayElephant() {
		System.out.println("color: "+color+" age: "+age+" weight: "+weight);
		System.out.println("isvegetarian: "+isVegetarian());
		System.out.println("canClimb: "+canClimb());
		System.out.println("Sound: "+Sound());
		
	}

}
