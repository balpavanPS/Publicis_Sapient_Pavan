package com.assign.exception;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of emp you want ro add");
		int noOfRecord=sc.nextInt();
		for(int i=0;i<noOfRecord;i++) {
			emp.addEmp();
		}}
		catch(AgeExceptionClass a) {
			System.out.println("Enter Valid Age.");
		}
		catch(NameexceptionClass n) {
			System.out.println("Already Exists");
		}

	}

}
