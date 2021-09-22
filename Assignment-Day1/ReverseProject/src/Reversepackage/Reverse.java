package Reversepackage;

public class Reverse {
	private int number,reverseNumber;


	public void setNumber(int number) {
		this.number = number;
	}


	public int getReverseNumber() {
		int rem=0;
		while(number!=0)
		{
			rem=number%10;
			reverseNumber=reverseNumber*10+rem;
			number/=10;
		}
		return reverseNumber;
	}
}
