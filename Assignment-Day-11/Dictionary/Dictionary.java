package assignment;

import java.util.HashMap;
import java.util.Map;

public class Dictionary 
{
	private String word;
	private String meaning;
	
	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", meaning=" + meaning + "]";
	}
	public Dictionary(String word, String meaning) {
		super();
		this.word = word;
		this.meaning = meaning;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	
   
}
