package assignment;

import java.util.ArrayList;

public class LibraryGeneric<T1,T2,T3>
{	
    ArrayList<T1> books=new ArrayList<T1>();
    ArrayList<T2> videos=new ArrayList<T2>();
    ArrayList<T3> newspapers=new ArrayList<T3>();
	
	
	
	public ArrayList<T1> getBooks() {
		return books;
	}
	public ArrayList<T2> getVideos() {
		return videos;
	}
	public ArrayList<T3> getNewspapers() {
		return newspapers;
	}
	public void addBooks(T1 book)
	{
		books.add(book);
		
	}
	public void addVideos(T2 video)
	{
		videos.add(video);
	
	}
	public void addNewsPapers(T3 newspaper)
	{
		newspapers.add(newspaper);
		
	}
	
	public void removeBooks(T1 book)
	{
		books.remove(book);
		System.out.println("Removed Successfully!");
	}
	public void removeVideos(T2 video)
	{
		videos.remove(video);
		System.out.println("Removed Successfully!");
	}
	public void removeNewsPapers(T3 newspaper)
	{
		newspapers.remove(newspaper);
		System.out.println("Removed Successfully!");
	}
	
	
	
}
