/*
name : somnath Hazra
@date : 20th sept,2022
Library Books with parqamitarized constructur usnig array
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
	
	// method to display books
	void displayBooks(){
		
		System.out.println("Book Name: " + this.bookName+"  "+"Author Name: "+authorName);
	}
}
//end class
	
	
	// Declare class Library
	class LibraryArray 
	
	{
		//Main Method
		public static void main(String...args)
		
		{
			
			Books book[] = new Books[5]; // creates an array of movies
			//creating objects
			book[0] = new Books("Debjan","Bibhutibhushan Bandyopadhyay");
			book[1] = new Books("The Alchemist","Paolo Choleho");
			book[2] = new Books("Harry Potter","J. K. Rowling");
			book[3] = new Books("Padma Nadir Majhi","Manik Bandyopadhyay");
			book[4] = new Books("Misir Ali","Humayun Ahmed");
			
				//Displaying all the books
			for(int i = 0;i<book.length;i++){
				book[i].displayBooks();
				
			}	
		}
	}