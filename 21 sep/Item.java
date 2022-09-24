/*
program : craeting item
&author:Somnath Hazra
@date : 21th sept,2022
*/
//declaring class Item
class Item{
	
	
	//main method
	public static void main(String...args){
		
		//constructor injection    // tight coupling
		
		//declare objects of cart class
		Cart a = new Cart("Soap",2,5.00);
		
		//display the cart
		System.out.println("Item: "+a.getCartItem()+"  Quantity: "+a.getCartQuantity()+"price: "+a.getPrice());
		
		
		// getter setter injection  // loose coupling
		Cart a2 = new Cart();
		a2.setCartItem("colgate");
		a2.setCartQuantity(2);
		a2.setPrice(20.00);
		
		System.out.println("Item: "+a2.getCartItem()+"  Quantity: "+a2.getCartQuantity()+"price: "+a2.getPrice());

	}


}