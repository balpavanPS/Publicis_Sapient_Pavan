package org.animals;

public class Monkey {
	private String color = "Black";
	private int age = 15;
	private double weight = 75.25;
	public boolean isVegetarian() {
		boolean vegetarian=true;
		return vegetarian;
	}
	public boolean canClimb() {
		boolean climb=true;
		return climb;
	}
	public String Sound() {
		String sound="Monkey Snore";
		return sound;
	}
	public void displayMonkey() {
		System.out.println("color: "+color+" age: "+age+" weight: "+weight);
		System.out.println("isvegetarian: "+isVegetarian());
		System.out.println("canClimb: "+canClimb());
		System.out.println("Sound: "+Sound());
		
	}

}
