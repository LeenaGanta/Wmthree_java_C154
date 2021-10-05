package assignment;

public class TelephoneMain
{
	public static void main(String[] args) {
		TelephoneDetails tdir=new TelephoneDetails();
		for(TelephoneDirectory telephone:tdir.getTelephoneDir())
			System.out.println(telephone);
	}

}
