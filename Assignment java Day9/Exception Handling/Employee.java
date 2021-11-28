package com.assign.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> empName=new ArrayList<String>();
	ArrayList<Integer> empAge=new ArrayList<Integer>();
	public void addEmp() throws NameexceptionClass,AgeExceptionClass {
		
				
		System.out.println("Enter employee name");

		String name=sc.next();
		Iterator<String> iterator=empName.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().matches(name)) 
				throw new NameexceptionClass("already exist");
			else
				continue;
		}
		empName.add(name);
		System.out.println("Enter emp age");
		int age=sc.nextInt();
		if(age<0 || age<18 || age>60)
			throw new AgeExceptionClass("Enter valid age");
		empAge.add(age);
		
		
	}

}
