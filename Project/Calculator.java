/*
Program : Calculater
name : somnath Hazra
@date : 22th sept,2022
*/
//import scanner pakage
import java.util.Scanner;
class Calculator{
	
	// static variable
	static double answer = 0.0;
	
	//method for addition
	double addition(double num1,double num2){
		return num1+num2;
	}
	
	//method for subtraction
	double subtraction(double num1,double num2){
		return num1-num2;
	}
	
	//method for multiplication
	double multiplication(double num1,double num2){
		return num1*num2;
	}
	
	//method for division
	double division(double num1,double num2){
		return num1/num2;
	}
	
	// main method of the class
	public static void main(String...args){

			//sc as a scanner
			Scanner sc = new Scanner(System.in);
			
			// number1 and number2 variable for input
			double number1,number2;
			
			//choice for want to another perform and opearator for arithmetic opearation
			char choice,opearator;
			
			System.out.println("********Calculator**********");
			System.out.println("Enter two numbes:----");
			
			// input the numbers
			number1 = sc.nextDouble();
			number2 = sc.nextDouble();
			
			//create object of the Calculater class
			Calculator cal = new Calculator();
			
			
			// loop until user want to stop
			while(true){
				
					// take input of the opearator
					System.out.println("chose the opearator: ");
					opearator = sc.next().charAt(0);
					
				// perform switch operation to calculate 
				switch(opearator){
				// for addition
				case '+': Calculator.answer = cal.addition(number1,number2);
							break;
				// for subtraction
				case '-': Calculator.answer = cal.subtraction(number1,number2);
							break;
				// for multiplication
				case '*': Calculator.answer = cal.multiplication(number1,number2);
							break;
				// for division
				case '/': Calculator.answer = cal.division(number1,number2);
							break;
				default: System.out.println("wrong input");
			}
			
				//print the answer
				System.out.println(number1+" "+opearator+" "+number2+" = "+ " " +Calculator.answer);
				System.out.println("are want to performe more perform");
				
				//choice for more operation
				choice = sc.next().toLowerCase().charAt(0);
				
				//condition for choice
				if(choice == 'y'){
					number1 = Calculator.answer;
					System.out.println("Enter the number");
					number2 = sc.nextDouble();
					
				}
				else{
					break;
				}
				
			}//while loop end
		
	}//main method end
	
}// end Calculater class