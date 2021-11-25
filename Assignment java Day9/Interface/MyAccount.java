package bankImpl;

public class MyAccount {

	public static void main(String[] args) {
		SavingAcc pavan=new SavingAcc();
		pavan.createAcc();
		pavan.calInt();
		pavan.setDeposit(40000);
		pavan.deposit();
		pavan.setWithdraw(10000);
		pavan.withDraw();
		pavan.getBalance();
		
		SavingAcc poppy=new SavingAcc();
		poppy.createAcc();
		poppy.calInt();
		poppy.setDeposit(100000);
		poppy.deposit();
		poppy.setWithdraw(5000);
		poppy.withDraw();
		poppy.getBalance();
		
		
		PersonalLoanAcc anup=new PersonalLoanAcc();
		anup.createAcc();
		anup.setPrincipal(500000);
		anup.payInterest();
		anup.calInt();
		anup.repayPrincipal();
		anup.payPartialPrincipal();
		
		HousingLoanAcc gnan=new HousingLoanAcc();
		gnan.createAcc();
		gnan.setPrincipal(1200000);
		gnan.payInterest();
		gnan.calInt();
		gnan.repayPrincipal();
		gnan.payPartialPrincipal();
	}

}
