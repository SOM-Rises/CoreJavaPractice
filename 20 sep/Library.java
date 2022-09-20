/*
name : somnath Hazra
@date : 20th sept,2022
Library Books 
*/

class Books
{
	//declaring books properties
	private String bookName;
	private String authorName;
	
	// method insert Book
	void insertBook(String bookName,String authorName){
		
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	// method to display books
	void displayBooks(){
		
		System.out.println("Book Name: " + this.bookName+"  "+"Author Name: "+authorName);
	}
}
//end class
	
	
	// Declare class Library
	class Library 
	
	{
		//Main Method
		public static void main(String...args)
		
		{
			// create library object
			Books book1 = new Books();
			book1.insertBook("Debjan","Bibhutibhushan Bandyopadhyay"); // implicit
			
			Books book2 = new Books();
			book2.insertBook("The Alchemist","Paolo Choleho");
			 
		    book1.displayBooks();
			book2.displayBooks();
			
			
			
			
		}
		
		
		
		
		
	}