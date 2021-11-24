package com.poppy.eggs;

public class MainEggs {

	public static void main(String[] args) {
		Eggs eggs = new Eggs();
		eggs.setNumber(354);
		eggs.calculateGross();
		eggs.calculateDozen();
		eggs.calculateLeft();
		eggs.displayEggs();

	}

}
