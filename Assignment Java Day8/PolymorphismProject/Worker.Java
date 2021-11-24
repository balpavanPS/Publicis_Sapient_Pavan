package com.pavan.worker;

public class Worker {
	private String name;
	private int SalaryRate;
	public Worker(String name,int SalaryRate) {
		this.name=name;
		this.SalaryRate=SalaryRate;
	}
	public String getName() {
		return name;
	}
	public int getSalaryRate() {
		return SalaryRate;
	}
	
}
