/*
name : somnath Hazra
@date : 20th sept,2022
Library Books with parqamitarized constructur
*/

class Books
{
	//declaring books properties
	private String bookName;
	private String authorName;
	
	
	//Parameterized Constructor
	Books(String bookName,String authorName)
	{
		this.bookName = bookName;
		this.authorName = authorName;
	}

	//copy Constructor
	Books(Books book3)
	{
		//System.out.println("In the Copy Constructor");
		this.bookName = book3.bookName;
		this.authorName = book3.authorName;
	}	
	
	// method to display books
	void displayBooks(){
		
		System.out.println("Book Name: " + this.bookName+"  "+"Author Name: "+authorName);
	}
}
//end class
	
	
	// Declare class Library
	class LibraryConst 
	
	{
		//Main Method
		public static void main(String...args)
		
		{
			//create book1 object
			Books book1 = new Books("Debjan","Bibhutibhushan Bandyopadhyay");
		                                                                  // implicit method
			//create book2 object
			Books book2 = new Books("The Alchemist","Paolo Choleho");
			
			//create book3 object
			Books book3 = new Books("Harry Potter","J. K. Rowling");
			
			 //create book4 object
			Books book4 = new Books(book3);
			
			 //dispaling the books calling displayBooks method
		    book1.displayBooks();
			book2.displayBooks();
			book3.displayBooks();
			book4.displayBooks();
			
			
			
		}
		
		
		
		
		
	}