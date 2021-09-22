package eggs;

import java.util.Scanner;

public class EggsInput {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of eggs:");
	int n=sc.nextInt();
	CalculateEggs totalEggs=new CalculateEggs(n);
	NEggs ne1=totalEggs.Calculation();
	System.out.println("Gross: "+ne1.getGross());
	System.out.println("Dozen: "+ne1.getDozen());
	System.out.println("Remaining Eggs: "+ne1.getRemainingEggs());
}
	
}
