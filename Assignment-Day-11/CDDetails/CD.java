package assignment;

import java.util.Objects;

public class CD implements Comparable<CD>
{
	private String title;
	private String singer;
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	public CD(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "CD [title=" + title + ", singer=" + singer + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	@Override
	public int compareTo(CD o) {

		if(this.singer.compareTo(o.singer)>0)
			return 1;
		else if(this.singer.compareTo(o.singer)<0)
			return -1;
		return 0;
	}
	

}
