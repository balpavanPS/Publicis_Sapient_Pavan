package com.pavan.worker;

public class WorkerMain {

	public static void main(String[] args) {
		DailyWorker dailyworker=new DailyWorker();
		dailyworker.Pay(5);
		
		SalariedWorker salariedworker= new SalariedWorker();
		salariedworker.Pay();
		

	}

}
