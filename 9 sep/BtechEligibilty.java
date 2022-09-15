public class BtechEligibilty{
		public static void main(String[] args){
			
		float totalMarks = Float.parseFloat(args[0]);
		float pcmMarks = Float.parseFloat(args[1]);
		
			if(totalMarks>60){
				if((totalMarks>=80) || (pcmMarks>=85)){
				System.out.println("you are eligible in btech");
			
			}
			else{
				System.out.println("you are eligible take admisson");
			
			}
		}
		
		else{
			System.out.println("you are not eligible in btech");
		}

}


}
