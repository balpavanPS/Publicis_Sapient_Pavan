package com.pavan.worker;

public class SalariedWorker extends Worker {
	public SalariedWorker() {
		super("Pavan",200);
		
	}
	public void Pay() {
		int weekPay=getSalaryRate()*40;
		System.out.println("The weekly pay for the employee "+getName()+": "+weekPay);
	}
}
