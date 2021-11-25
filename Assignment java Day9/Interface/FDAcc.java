package bankImpl;

import bank.CreditInterest;
import bank.DepositAcc;

public class FDAcc implements DepositAcc, CreditInterest {
	private int deposit,withdraw;

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	@Override
	public void createAcc() {
		System.out.println("This is a "+fixed);

	}

	@Override
	public void calInt() {
		addMonthlyInt();
		addHalfYrlyInt();
		addAnnualInt();

	}

	@Override
	public void addMonthlyInt() {
		double monthlyInt=fixedPercentage/12;
		System.out.println("This "+fixed+" has an monthly interest of "+monthlyInt);

	}

	@Override
	public void addHalfYrlyInt() {
		double halfYrlyInt=fixedPercentage/2;
		System.out.println("This "+fixed+" has an half yearly interest of "+halfYrlyInt);
	}

	@Override
	public void addAnnualInt() {
		double annualInt=fixedPercentage;
		System.out.println("This "+fixed+" has an Annual interest of "+annualInt);

	}

	@Override
	public void withDraw() {
		System.out.println("You've withdrawn: "+withdraw);
	}

	@Override
	public void deposit() {

		System.out.println("you deposited: "+deposit+" rupees.");
	}

	@Override
	public void getBalance() {
		
		int balance=deposit-withdraw;
		System.out.println("You're Balance is: "+balance);
	}

}
