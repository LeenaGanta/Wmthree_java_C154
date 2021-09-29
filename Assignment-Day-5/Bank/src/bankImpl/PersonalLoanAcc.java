package bankImpl;

import bank.DebitInterest;
import bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc, DebitInterest {
	 private double interest=0.0,principal=0.0;
	 

	@Override
	public void createAcc() {
		System.out.println(personalLoan+" Account is Created!");

	}

	@Override
	public double calcInt() {
		interest=principal*personalLoanAcc;
		return interest;
	}

	@Override
	public void deductMonthlyInt() {
		principal-=personalLoanAcc/12;

	}

	@Override
	public void deductHalfYrlyInt() {
		principal-=personalLoanAcc/2;

	}

	@Override
	public void deductAnnualInt() {
		principal-=personalLoanAcc;

	}

	@Override
	public void repayPrincipal(double amount) {
		principal+=amount;

	}

	@Override
	public String payInterest() {
		return personalLoanAcc+"%";

	}

	@Override
	public void payPartialPrinciple(double num) {
		principal+=num;

	}

	public double getPrincipal() {
		return principal;
	}
	
	

}
