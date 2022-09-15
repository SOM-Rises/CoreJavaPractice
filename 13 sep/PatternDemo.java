/*
Program:
@author: Me
@date: 13th Sept, 2022
*/

class PatternDemo{
	static void createPattern(int n){
		for(int i = n ; i > 0; i--){
			System.out.println(" ");
			for(int j = 0 ; j < i ; j++){
				System.out.print("* ");
			}
		}
	}
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		createPattern(num);
	}
}