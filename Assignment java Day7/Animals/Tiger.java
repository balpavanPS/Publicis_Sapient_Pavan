package org.animals;

public class Tiger {
	private String color = "Yellow";
	private int age = 25;
	private double weight = 110.25;
	public boolean isVegetarian() {
		boolean vegetarian=false;
		return vegetarian;
	}
	public boolean canClimb() {
		boolean climb=false;
		return climb;
	}
	public String Sound() {
		String sound="Tiger Roar";
		return sound;
	}
	public void displayTiger() {
		System.out.println("color: "+color+" age: "+age+" weight: "+weight);
		System.out.println("isvegetarian: "+isVegetarian());
		System.out.println("canClimb: "+canClimb());
		System.out.println("Sound: "+Sound());
		
	}

}
