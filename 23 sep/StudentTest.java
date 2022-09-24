
/*
@author : Somnath Hazra
Date : 23 sep,2022
*/

class StudentTest
{
   public static void main(String...args){
	   
	   Student s[] = new Student[5];
	   /* for(int i = 0;i<5;i++){
		   s[i] = new Student();
	   } */
	   
	   //Constructor Injection
	   s[0] = new Student(22,"somnath",56);
	    s[1] = new Student(21,"Sam",87);
		 s[2] = new Student(23,"AYan",90);
		  s[3] = new Student(24,"Subham",96);
		   s[4] = new Student(28,"Snehasish",80);
		   
		   
		   System.out.println("----------Name of the Student whose marks greater than or equal to 90 ---------");
		   //for loop to find whose marks greated than edual to 90
		   for(int i = 0;i<5;i++){
			   float m = s[i].getMarks();
			   if(m>=90){
				   System.out.println("Name of the Student :"+ s[i].getName());
			   }
		   }
   }



}