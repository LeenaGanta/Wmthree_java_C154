package bank;

public interface CreditInterest extends Interest 
{
 double addMonthlyInt();
 double addHalfYrlyInt();
 double addAnnualInt();
}
