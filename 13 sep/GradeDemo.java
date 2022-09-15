class GradeDemo{
	public static void main(String args[])     //Calling The Main Method
	{ 	//float grade = Float.parseFloat(args[0]);
		int grade = Integer.parseInt(args[0]);
		if(grade<25)
		{
			System.out.println("F");
		}
		else if ((grade>=25) && (grade<45))
		{
			System.out.println("E");
		}
		else if ((grade>=45) && (grade<50))
		{
			System.out.println("D");
		}
		else if ((grade>=50) && (grade<60))
		{
			System.out.println("C");
		}
		else if ((grade>=60) && (grade<=80))
		{
			System.out.println("B");
		}
		else
			System.out.println("A");
	}
}