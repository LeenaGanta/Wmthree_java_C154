package assignment;

import java.util.HashMap;
import java.util.Map;

public class DictionaryDetails
{
	Map<String,String> dictionary=new HashMap<String,String>();
	
	Map<String, String> getDictionary()
	{
		 Dictionary dict1=new Dictionary("Hilarious", "Funny");
		 Dictionary dict2=new Dictionary("Treachery", "Act of violating trust");
		 Dictionary dict3=new Dictionary("Typical", "Normal");
		 Dictionary dict4=new Dictionary("Decoy", "Plot");
		 Dictionary dict5=new Dictionary("Astraphobia", "Abnormal Fear of Thunder");
		 Dictionary dict6=new Dictionary("Sociopath", "A person with antisocial personality disorder");
		 Dictionary dict7=new Dictionary("Touche", "An acknowledgement of a hit");
		 Dictionary dict8=new Dictionary("Cliche", "Something most often used");
		 Dictionary dict9=new Dictionary("Exacerbate", "To make worse");
		
		 dictionary.put(dict1.getWord(),dict1.getMeaning());
		 dictionary.put(dict2.getWord(),dict2.getMeaning());
		 dictionary.put(dict3.getWord(),dict3.getMeaning());
		 dictionary.put(dict4.getWord(),dict4.getMeaning());
		 dictionary.put(dict5.getWord(),dict5.getMeaning());
		 dictionary.put(dict6.getWord(),dict6.getMeaning());
		 dictionary.put(dict7.getWord(),dict7.getMeaning());
		 dictionary.put(dict8.getWord(),dict8.getMeaning());
		 dictionary.put(dict9.getWord(),dict9.getMeaning());
		 return dictionary;
	}

	String findMeaning(String word)
	{
		for(String word1:dictionary.keySet())
			if(word1.equals(word))
				return dictionary.get(word1);
		return "No word Found";
	}

	

}
