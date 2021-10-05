package assignment;

import java.util.Set;
import java.util.TreeSet;

public class CdDetails
{
	Set<CD> cd=new TreeSet<CD>();

	public Set<CD> getCd() {
		cd.add(new CD("Memories","Maroon 5"));
		cd.add(new CD("Love Story","Taylor Swift"));
		cd.add(new CD("Senorita","Shawn Mendes"));
		cd.add(new CD("Dynamite","BTS"));
		cd.add(new CD("7 rings","Ariana Grande"));
		
		
		return cd;
	}
	
	
	

}
