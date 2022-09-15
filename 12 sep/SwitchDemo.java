class SwitchDemo{
	public static void main(String args[])     //Calling The Main Method
	{ 	
		String game = args[0].toLowerCase();
		
		switch(game)
		
		{
			case "football" : String role = args[1].toLowerCase();
							  System.out.println("I love " + game);
							  switch(role)
							  {
								 case "keeper" :   System.out.println("I am a " + role);
												    break;
								 
								 case "striker" :   System.out.println("I am a " + role);
													break;
								 
								 default:  System.out.println("I am a god");
								 
							  }
							  break;
			case "cricket" : System.out.println("I love " + game);
							  break;
			case "badminton" : System.out.println("I love " + game);
							  break;
			default : System.out.println("I love to Live againg");
		
		
		}
	
	}
}