/*
program : craeting class bank to create accounts
&author:Somnath Hazra
@date : 21th sept,2022
*/

//declaring class bank

class Bank{
	
	//main method
	public static void main(String...args)
	{
		//constructor injection    // tight coupling
		
		//declare objects of Account class
		Account acc1 = new Account(3456,"somnath",45000.0);
		Account acc2 = new Account(3457,"subham",45000.0);
		
		
		//display the accounts
		System.out.println("Account ID: "+acc1.getAccID()+"  name: "+acc1.getAccName()+"Balance: "+acc1.getBalance());
		System.out.println("Account ID: "+acc2.getAccID()+"  name: "+acc2.getAccName()+"Balance: "+acc2.getBalance());
		
		// getter setter injection  // loose coupling
		
		//creating acc3 object of Account class
		Account acc3 = new Account();
		acc3.setAccID(3458);
		acc3.setAccName("ayan");
		acc3.setBalance(50000.0);
		System.out.println("Account ID: "+acc3.getAccID()+"  name: "+acc3.getAccName()+"Balance: "+acc3.getBalance());

	}
	
	
}