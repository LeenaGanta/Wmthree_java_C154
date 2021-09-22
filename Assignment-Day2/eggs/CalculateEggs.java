package eggs;

public class CalculateEggs
{
	private int eggs;
	CalculateEggs(int n)
	{
		eggs=n;
	}
	public NEggs Calculation()
	{
		NEggs ne=new NEggs();
		ne.setNumEggs(eggs);
		int dz=(ne.getNumEggs())/12;
		int gs=(ne.getNumEggs())/144;
		int re=ne.getNumEggs()%12;
	    ne.setDozen(dz);
	    ne.setGross(gs);
	    ne.setRemainingEggs(re);
	    return ne;
	  }
}