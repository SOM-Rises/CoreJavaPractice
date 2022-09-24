/*
@author : Somnath Hazra
Date : 23 sep,2022
*/
//import Scanner
import java.util.Scanner;

//Declare Account class
class Account{
	
	//main class
	public static void main(String...args){
		
		
		Scanner sc = new Scanner(System.in);
		
		//take size input of the array
		System.out.println("ENter the size");
		int size = sc.nextInt();
		
		//creates an array in the memory of size 
		Bank bankDetails[] = new Bank[size]; 

		// constructor injection
	/* 	bankDetails[0] = new Bank(1,"somnath",5000.0);
		bankDetails[1] = new Bank(2,"ayan",1000.0);
		bankDetails[2] = new Bank(3,"subaham",500.0);
		bankDetails[3] = new Bank(4,"snehasish",600.0);
		bankDetails[4] = new Bank(5,"som",900.0); */
		
		
		// from user Input
		for(int i = 0;i<size;i++){
			
			
			bankDetails[i]= new Bank();
			
			System.out.println("ENter the Accid");
			bankDetails[i].setAccid(sc.nextInt());
			
			System.out.println("ENter the Name");
			bankDetails[i].setName(sc.next());
			
			System.out.println("ENter the Balance");
			bankDetails[i].setBalance(sc.nextDouble());
		}
		
		System.out.println("----------Whos Balance less than 1000---------");
		
		for(int i = 0;i<size;i++){
			double m = bankDetails[i].getBalance();
			if(m<1000){
				System.out.println("Name: "+ bankDetails[i].getName());
			}
			
		}
		
	}
	
	
}
