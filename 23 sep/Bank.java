/*
@author : Somnath Hazra
Date : 23 sep,2022
*/

class Bank{

	//declare instance variable
	private int accId;
	private String name;
	private double balance;
	
	//n0 argument constructor
	Bank(){
		
	}
	
	//parameterized constructor
	Bank(int accId,String name,double balance){
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}
	
	
	// setter and getter method for accId,name,balance
	void setAccid(int accId){
		this.accId = accId;
	}
	int getAccid(){
		return this.accId;
	}
	
	//////////////////////////////
	void setName(String name){
		this.name = name;
	}
	String getName(){
		return this.name;
	}
	
	//////////////////////////////
	void setBalance(double balance){
		this.balance = balance;
	}
	
	double getBalance(){
		return this.balance;
	}
	

}