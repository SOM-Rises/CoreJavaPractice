
/*
@author : Somnath Hazra
Date : 23 sep,2022
*/

class Student{
	
	//declare instance variable
	private int rollno;
	private String name;
	private float marks;
	
	//default cosntructor
	Student(){
		
		
	}
	//parameterized cosntructor
	Student(int rollno,String name,float marks){
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	//setter for rollno
	void setRollno(int rollno){
		this.rollno = rollno;
	}
	//getter for rollno
	int getRollno(){
		return this.rollno;
	}
	
	//setter for name
	void setName(String name){
	    this.name = name;
	}
	//getter for name
	String getName(){
		return this.name;
	}
	
	//setter for marks
	void setMarks(float marks){
	    this.marks = marks;
	}
	//getter for marks
	float getMarks(){
		return this.marks;
	}
	
}