package assignment;

import java.util.ArrayList;

public class Library 
{
	 ArrayList<String> books=new ArrayList<String>();
	    ArrayList<String> videos=new ArrayList<String>();
	    ArrayList<String> newspapers=new ArrayList<String>();
		public ArrayList<String> getBooks() {
			return books;
		}
		public ArrayList<String> getVideos() {
			return videos;
		}
		public ArrayList<String> getNewspapers() {
			return newspapers;
		}
		
		public void addBooks(String book)
		{
			books.add(book);
			
		}
		public void addVideos(String video)
		{
			videos.add(video);
		
		}
		public void addNewsPapers(String newspaper)
		{
			newspapers.add(newspaper);
			
		}
		
		public void removeBooks(String book)
		{
			books.remove(book);
			System.out.println("Removed Successfully!");
		}
		public void removeVideos(String video)
		{
			videos.remove(video);
			System.out.println("Removed Successfully!");
		}
		public void removeNewsPapers(String newspaper)
		{
			newspapers.remove(newspaper);
			System.out.println("Removed Successfully!");
		}
		

}
