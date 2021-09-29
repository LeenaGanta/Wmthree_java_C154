package bankImpl;

public class MyAccount
{
	public static void main(String[] args) {
		SavingsAcc savAcc=new SavingsAcc();
		savAcc.createAcc();
		savAcc.Deposit(8000);
		System.out.println("Interest: "+savAcc.calcInt());
		System.out.println("Balance after adding Annual Interest: "+savAcc.addAnnualInt());
		System.out.println("Balance after adding half yearly interest: "+savAcc.addHalfYrlyInt());
		System.out.println("Balance after adding monthly interesrt: "+savAcc.addMonthlyInt());
		savAcc.withDraw(500.95);
		System.out.println("Balance: "+savAcc.getBalance());
		
		FDAcc fixedDep=new FDAcc();
		fixedDep.createAcc();
		fixedDep.Deposit(100000);
		System.out.println("Interest: "+fixedDep.calcInt());
		System.out.println("Balance after adding Annual Interest: "+fixedDep.addAnnualInt());
		System.out.println("Balance after adding monthly interesrt: "+fixedDep.addMonthlyInt());
		System.out.println("Balance after adding half yearly interest: "+fixedDep.addHalfYrlyInt());
		fixedDep.withDraw(25065.36);
		System.out.println("Balance: "+fixedDep.getBalance());
		
		PersonalLoanAcc persLoan=new PersonalLoanAcc();
		persLoan.createAcc();
		persLoan.repayPrincipal(500000);
		System.out.println("Principal loan is: "+persLoan.getPrincipal());
		System.out.println("Interest on Loan is: "+persLoan.calcInt());
		persLoan.deductMonthlyInt();
		System.out.println("Principal after deducting monthly interest is: "+persLoan.getPrincipal());
		persLoan.deductHalfYrlyInt();
		System.out.println("Principal after deducting half yearly interest is: "+persLoan.getPrincipal());
		persLoan.deductAnnualInt();
		System.out.println("Principal after deducting yearly interest is: "+persLoan.getPrincipal());
		
		
		HousingLoanAcc houseLoan=new HousingLoanAcc();
		houseLoan.createAcc();
		houseLoan.repayPrincipal(1500000);
		System.out.println("Principal loan is: "+houseLoan.getPrincipal());
		System.out.println("Interest on Loan is: "+houseLoan.calcInt());
		houseLoan.deductMonthlyInt();
		System.out.println("Principal after deducting monthly interest is: "+houseLoan.getPrincipal());
		houseLoan.deductHalfYrlyInt();
		System.out.println("Principal after deducting half yearly interest is: "+houseLoan.getPrincipal());
		houseLoan.deductAnnualInt();
		System.out.println("Principal after deducting yearly interest is: "+houseLoan.getPrincipal());

	}
	

}
