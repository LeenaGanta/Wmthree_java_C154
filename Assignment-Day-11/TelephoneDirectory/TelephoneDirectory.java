package assignment;

public class TelephoneDirectory 
{
	private long phNum;
	private String name;
	private String address;
	private String state;
	public long getPhNum() {
		return phNum;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getState() {
		return state;
	}
	public TelephoneDirectory(long phNum, String name, String address, String state) {
		super();
		this.phNum = phNum;
		this.name = name;
		this.address = address;
		this.state = state;
	}
	@Override
	public String toString() {
		return "TelephoneDirectory [phNum=" + phNum + ", name=" + name + ", address=" + address + ", state=" + state
				+ "]";
	}
	

}
