/*
program : Cart Item
&author:Somnath Hazra
@date : 21th sept,2022
*/


class Cart{
	
	// declare instance variable
    private String cartItem;
	private int cartQuantity;
	private double price;
	
	// no argument constructor
	Cart(){
		
	}
	
	//paramerized constructor
	Cart(String cartItem,int cartQuantity,double price){
		this.cartItem = cartItem;
		this.cartQuantity = cartQuantity;
		this.price = price;
		
	}
	
	//getter setter method
	String getCartItem(){
		return this.cartItem;
	}
	void setCartItem(String cartItem){
		this.cartItem = cartItem;
	}
	
	/////////////////////////
	int getCartQuantity(){
		return this.cartQuantity;
	}
	void setCartQuantity(int cartQuantity){
		this.cartQuantity = cartQuantity;
	}
	
	//////////////////////
	double getPrice(){
		return this.price;
	}
	void setPrice(double price){
		this.price = price;
	}
}