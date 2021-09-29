package bank;

public interface DepositAccount extends Account
{
  void withDraw(double num);
  void Deposit(double num);
  double getBalance();
}
