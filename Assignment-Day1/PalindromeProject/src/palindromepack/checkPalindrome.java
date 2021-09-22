package palindromepack;

public class checkPalindrome {
public static void main(String[] args) {
	Palindrome p=new Palindrome();
	p.setNumber(121);
	if(p.isStatus()==true)
	System.out.println("Given number is palidrome");
	else
		System.out.println("Given number is not a palidrome");
}

}
