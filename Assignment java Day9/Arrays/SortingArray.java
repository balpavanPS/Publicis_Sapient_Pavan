package com.poppy.array;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		int arr[];
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no of elements: ");
		int total=sc.nextInt();
		arr=new int[total];
		
		for(int index=0;index<total;index++) {
			System.out.println("Enter element: ");
			arr[index]=sc.nextInt();
		}
		
		System.out.println("The array before sorting: ");
		for(int element:arr) {
			System.out.println(element);
		}
		for (int i = 0; i < total; i++) {     
            for (int j = i+1; j < total; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
		System.out.println("The array after sorting: ");
		for(int ele:arr) {
			System.out.println(ele);
		}
	}

}
