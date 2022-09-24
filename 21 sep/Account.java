/*
program : understanding java bean and encapsulation
POJO class: plain old java object
&author:Somnath Hazra
@date : 21th sept,2022
*/

class Account{
	
	//declaring instance variable
	private int accID;
	private String accName;
	private double balance;
	
	//default constructor
	Account(){
		
	}
	
	//paramerized constructor
	Account(int accID,String accName,double balance){
		this.accID = accID;
	    this.accName = accName;
		this.balance = balance;
	}
	
	//getter setter method
	
	int getAccID(){
		return this.accID;
	}
	void setAccID(int accID){
		this.accID = accID;
	}
	
	///////////////////////////
	String getAccName(){
		return this.accName;
	}
	void setAccName(String accName){
		this.accName = accName;
	}
	
	/////////////////////////
	double getBalance(){
		return this.balance;
	}
	void setBalance(double balance){
		this.balance = balance;
	}
}