package bank;

public interface LoanAcc extends Account
{
	void repayPrincipal(double amount);
	String payInterest();
	void payPartialPrinciple(double num);

}
