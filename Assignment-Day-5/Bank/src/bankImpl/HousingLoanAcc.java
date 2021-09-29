package bankImpl;

import bank.DebitInterest;
import bank.LoanAcc;

public class HousingLoanAcc implements DebitInterest, LoanAcc {
	 private double interest=0.0,principal=0.0;
	 
	@Override
	public double calcInt() {
		interest=principal*housingLoanAcc;
		return interest;
	}

	@Override
	public void createAcc() {
		System.out.println(housingLoan+" Account is Created!");

	}

	@Override
	public void repayPrincipal(double amount) {
		principal+=amount;

	}

	@Override
	public String payInterest() {
		return housingLoanAcc+"%";
	}

	@Override
	public void payPartialPrinciple(double num) {
		principal+=num;

	}

	@Override
	public void deductMonthlyInt() {
		principal-=housingLoanAcc/12;

	}

	@Override
	public void deductHalfYrlyInt() {
		principal-=housingLoanAcc/2;

	}

	@Override
	public void deductAnnualInt() {
		principal-=housingLoanAcc;

	}

	public double getPrincipal() {
		return principal;
	}
	
	

}
