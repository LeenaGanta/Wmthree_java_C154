package assignment;

import java.util.Map;
import java.util.Scanner;

public class DictionaryMain 
{
	public static void main(String[] args) {
		DictionaryDetails dict=new DictionaryDetails();
		Map<String,String> dictionary=dict.getDictionary();
		System.out.println("Select any words from below");
		for(String word:dictionary.keySet())
			System.out.println(word);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter word: ");
			String word=sc.nextLine();
			System.out.println("Word : "+word+", Meaning : "+dict.findMeaning(word));
		}
			
	}
	

}
