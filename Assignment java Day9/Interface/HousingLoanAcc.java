package bankImpl;

import bank.DebitInterest;
import bank.LoanAcc;

public class HousingLoanAcc implements LoanAcc, DebitInterest {
	private int principal;
	private double deductmonthlyInt,deductannualInt,deducthalfYrlyInt;
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("This is a "+housingLoan);
	}

	@Override
	public void calInt() {
		// TODO Auto-generated method stub
		deductMonthlyInt();
		deductHalfYrlyInt();
		deductAnnualInt();
	}

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub
		deductmonthlyInt=housingLoanPercentage/12;
		System.out.println("This "+housingLoan+" has an monthly interest of "+deductmonthlyInt);

	}

	@Override
	public void deductHalfYrlyInt() {
		// TODO Auto-generated method stub
		deducthalfYrlyInt=housingLoanPercentage/2;
		System.out.println("This "+housingLoan+" has an half yearly interest of "+deducthalfYrlyInt);
	
	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub
		deductannualInt=housingLoanPercentage;
		System.out.println("This "+housingLoan+" has an Annual interest of "+deductannualInt);
	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("You have to pay the Principal of "+principal);
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub
		System.out.println("You have to pay interest.");
	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub
		System.out.println("The partial principal would be: "+(principal/3));
	}

}
