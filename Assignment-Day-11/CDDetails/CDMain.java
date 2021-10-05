package assignment;

import java.util.Map;
import java.util.Set;

public class CDMain
{
	public static void main(String[] args) {
		CdDetails cd=new CdDetails();
        Set<CD> cdDetails=cd.getCd();
        for(CD cd1:cdDetails)
        System.out.println(cd1);
       
	}

}
