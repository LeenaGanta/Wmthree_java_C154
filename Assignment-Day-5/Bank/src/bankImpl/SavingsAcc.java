package bankImpl;

import bank.CreditInterest;
import bank.DepositAccount;

public class SavingsAcc implements DepositAccount, CreditInterest {
    private double interest=0,balance=0;
    
    
	@Override
	public void createAcc() {
		System.out.println(savings+" Account is Created !");

	}

	@Override
	public double calcInt() {
		interest=balance*savingsAcc;
		return interest;
	}

	public double addMonthlyInt() {
		interest=balance+(savingsAcc/12);
		balance+=interest;
		return balance;
	}

	@Override
	public double addHalfYrlyInt() {
		interest=balance+(savingsAcc/2);
		balance+=interest;
		return balance;

	}

	@Override
	public double addAnnualInt() {
		interest=balance+savingsAcc;
		balance+=interest;
		return balance;

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

   

}
