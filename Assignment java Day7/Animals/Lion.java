package org.animals;

public class Lion {
	private String color = "Brown";
	private int age = 25;
	private double weight = 100.25;
	public boolean isVegetarian() {
		boolean vegetarian=false;
		return vegetarian;
	}
	public boolean canClimb() {
		boolean climb=true;
		return climb;
	}
	public String Sound() {
		String sound="Lion Roar";
		return sound;
	}
	public void displayLion() {
		System.out.println("color: "+color+" age: "+age+" weight: "+weight);
		System.out.println("isvegetarian: "+isVegetarian());
		System.out.println("canClimb: "+canClimb());
		System.out.println("Sound: "+Sound());
		
	}

}
