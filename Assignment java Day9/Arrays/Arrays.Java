package com.poppy.array;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int sum=0;
		int arr[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int total=sc.nextInt();
		arr=new int[total];
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter the element: ");
			arr[index]=sc.nextInt();
		}
		for(int element:arr) {
			sum=sum+element;
		}
		System.out.println("The sum: "+sum);
		int avg=sum/total;
		System.out.println("The average: "+avg);

	}

}
