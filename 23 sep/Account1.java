

class Account1{
	
	public static void main(String...args){
		
		
		// allocating memory for 5 objects of type bank.
		Bank[] bankDetails = new Bank[5];
		
		bankDetails[0] = new Bank(1784589,"Somnath",800.0);
		bankDetails[1] = new Bank(1784588,"Ayan",600.0);
		bankDetails[2] = new Bank(1784587,"Subham",3330.0);
		bankDetails[3] = new Bank(1784586,"Snehasish",700.0);
		bankDetails[4] = new Bank(1784585,"Soumya",100.0);
		
		
		System.out.println("----------Whos Balance less than 1000---------");
		for(int i = 0;i<5;i++){
			if(bankDetails[i].getBalance()<1000){
				System.out.println("name: "+bankDetails[i].getName()+"   "+bankDetails[i].getBalance());
			}
			
		}
		
	}
	
	
	
}