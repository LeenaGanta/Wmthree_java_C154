package assignment;

public class LibraryMain
{
	public static void main(String[] args) {
		LibraryGeneric<String,String,String> libraryGen=new LibraryGeneric<String, String, String>();
		libraryGen.addBooks("Harry Potter");
		libraryGen.addBooks("Wings Of Fire");
		libraryGen.addVideos("Inception");
		libraryGen.addVideos("Avengers");
		libraryGen.addNewsPapers("The Hindu");
		libraryGen.addNewsPapers("Times Of India");
		
		System.out.println("Books using Generic class");
		for(String book:libraryGen.getBooks())
			System.out.println(book);
		
		System.out.println("Videos using Generic class");
		for(String video:libraryGen.getVideos())
			System.out.println(video);
		
		System.out.println("Newspapers using Generic class");
		for(String newspaper:libraryGen.getNewspapers())
			System.out.println(newspaper);

		System.out.println("=====================================");
		
		Library library=new Library();
		library.addBooks("Three Mistakes Of My Life");
		library.addBooks("Encyclopedia");
		library.addVideos("Beauty & the Beast");
		library.addVideos("Life Of PI");
		library.addNewsPapers("NewYork Times");
		library.addNewsPapers("Welcome India");
		
		System.out.println("Books using Normal Class");
		for(String book:library.getBooks())
			System.out.println(book);
		
		System.out.println("Videos using Normal Class");
		for(String video:library.getVideos())
			System.out.println(video);
		
		System.out.println("Newspapers using Normal Class");
		for(String newspaper:library.getNewspapers())
			System.out.println(newspaper);
		
		
		System.out.println("==============");
		libraryGen.removeBooks("Harry Potter");
		
		library.removeBooks("Encyclopedia");
	}
	
}
