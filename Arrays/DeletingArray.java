/*
program: Deleting an array
@author:Somnath Hazra
date:23 sept,2022
*/
// import Scanner pacage
import java.util.Scanner;

//create DeletingArray class
class DeletingArray{
	
		// method for deleting element of the array
	   static void deleting(int arr[],int num){
		boolean found = false;
		int pos = -1;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] == num)
				{
				pos = i;
				found = true;
				break;
				}
			
		}
		if(found)
		{	
			// the deleting alorithm
			for(int i = pos+1;i<arr.length;i++)
			{
				arr[i-1] = arr[i];
		
			}
			 System.out.println("----Elements after deleting the value "+ num + " are :");
			 for(int i = 0;i<arr.length-1;i++)
				{
				 System.out.print(arr[i]+" ");
				}
		}
		else
		{
			System.out.println("Elements not found");
		}
		
	   }// end of the deleting method
	   
		
		//Display method
		static void display(int arr[])
		{
			for(int i:arr)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	
	// main method
	public static void main(String...args)
	{	
		//sc as scanner
		Scanner sc = new Scanner(System.in);
		
		//Eneter the size
		System.out.println("Enter the size: ");
		int size = sc.nextInt();
		
		//create array
		int arr[] = new int[size];
		
		//input the element
		System.out.println("Enter the Elements: ");
		for(int i = 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Before the array: ");
		display(arr);//call display method

		System.out.println("Enter the value to deleting: ");
		int value = sc.nextInt();
		
		deleting(arr,value);// call deleting method
		
	}// end of the main method



}// end of the class