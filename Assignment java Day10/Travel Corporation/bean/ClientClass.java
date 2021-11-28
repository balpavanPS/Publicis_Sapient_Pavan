package com.travel.client;

import java.util.Scanner;

import com.travel.present.TravelPresentImpl;

public class ClientClass {

	public static void main(String[] args) {
		TravelPresentImpl travel=new TravelPresentImpl();
		Scanner sc= new Scanner(System.in);
		while(true) {
			travel.showMenu();
			System.out.println("Enter your Choice");
			int choice =sc.nextInt();
			travel.performMenu(choice);
		}


	}

}
