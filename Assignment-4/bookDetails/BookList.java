package bookDetails;

public class BookList 
{
	Book[] books=new Book[4];
	{
	books[0]= new Book(123,"Mistakes Of my life","Chetan Bhagat",250,200);
	books[1]=new Book(121,"Shining Stars","David Gowny",150,200);
	books[2]=new Book(131,"Harry Potter","J K Rowling",270,500);
	books[3]=new Book(123,"Lord Of The Rings","Gandalf",230,200);
	}
	
	public Book[] getBooks() {
		return books;
	}

	int n=4;
	 void selectionSort()
	 {
		 int min_idx;
		 Book temp;
			for(int i=0;i<n-1;i++)
				{
					min_idx=i;
					for(int j=i+1;j<n;j++)
					{
						if(books[i].getNoOfPages()>books[j].getNoOfPages())
							min_idx=j;
					}
					temp=books[min_idx];
					books[min_idx]=books[i];
					books[i]=temp;
				}
	 }
	 
	void bubbleSort()
	 {
		 int i,j;
		Book temp;
		for(i=0;i<n-1;i++)
		   {
			   for(j=0;j<n-i-1;j++)
			   {
				   int result=books[i].getBookName().compareTo(books[j].getBookName());
				   if(result>0)
				   {
					   temp=books[j];
					   books[j]=books[j+1];
					   books[j+1]=temp;
				
			   }
		   }   
			 
		
	 }
		
	 }
}
	
	


