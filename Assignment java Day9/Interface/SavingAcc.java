package bankImpl;

import bank.CreditInterest;
import bank.DepositAcc;

public class SavingAcc implements DepositAcc, CreditInterest {
	private int deposit,withdraw;

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	@Override
	public void createAcc() {
		System.out.println("This is a "+savings);
	}

	@Override
	public void calInt() {
		addMonthlyInt();
		addHalfYrlyInt();
		addAnnualInt();
	}

	@Override
	public void addMonthlyInt() {
		double monthlyInt=savingsPercentage/12;
		System.out.println("This"+savings+"has an monthly interest of "+monthlyInt);
	}

	@Override
	public void addHalfYrlyInt() {
		double halfYrlyInt=savingsPercentage/2;
		System.out.println("This"+savings+"has an half yearly interest of "+halfYrlyInt);

	}

	@Override
	public void addAnnualInt() {
		double annualInt=savingsPercentage;
		System.out.println("This"+savings+"has an Annual interest of "+annualInt);
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
