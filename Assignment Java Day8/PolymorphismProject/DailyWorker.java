package com.pavan.worker;

public class DailyWorker extends Worker {
	public DailyWorker() {
		super("Pavan",200);
		
	}
	public void Pay(int days) {
		int weekPay=getSalaryRate()*days;
		System.out.println("The weekly pay for the employee "+getName()+": "+weekPay);
	}

}
