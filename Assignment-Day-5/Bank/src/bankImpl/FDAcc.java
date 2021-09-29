package bankImpl;

import bank.CreditInterest;
import bank.DepositAccount;

public class FDAcc implements CreditInterest, DepositAccount {
	 private double interest=0,balance=0;
	
	 @Override
	public double calcInt() {
		interest=balance*fixedDepositAcc;
		return interest;

	}

	@Override
	public void createAcc() {
		System.out.println(fixed+" Account is Created !");
	}

	@Override
	public void withDraw(double num) {
		balance-=num;

	}

	@Override
	public void Deposit(double num) {
		balance+=num;

	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double addMonthlyInt() {
		interest=balance+(fixedDepositAcc/12);
		return interest;

	}

	@Override
	public double addHalfYrlyInt() {
		interest=balance+(fixedDepositAcc/2);
		return interest;

	}

	@Override
	public double addAnnualInt() {
		interest=balance+fixedDepositAcc;
        return interest;
	}

}
