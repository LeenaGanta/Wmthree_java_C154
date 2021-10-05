package assignment;

import java.util.ArrayList;

public class TelephoneDetails 
{
	ArrayList<TelephoneDirectory> telephoneDir=new ArrayList<TelephoneDirectory>();

	public ArrayList<TelephoneDirectory> getTelephoneDir() {
		
		telephoneDir.add(new TelephoneDirectory(7893940159L,"Leena","One Town", "Andhra Pradesh"));
		telephoneDir.add(new TelephoneDirectory(9296708486L,"Lakshmi","Two Town", "Banagalore"));
		telephoneDir.add(new TelephoneDirectory(9908167345L,"Raju","Two Town", "Tamil Nadu"));
		telephoneDir.add(new TelephoneDirectory(7815113135L,"Mahesh","Brahmin Street", "Chennai"));
		telephoneDir.add(new TelephoneDirectory(7306977345L,"Neeraj","One Town", "Andhra Pradesh"));
		telephoneDir.add(new TelephoneDirectory(8367479076L,"Manasa","Jubilee Hills", "Hyderabad"));
		return telephoneDir;
	}
	
	
	
	

}
