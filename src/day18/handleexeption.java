package day18;

import java.util.Scanner;

public class handleexeption {

	public static void main(String[] args) {
        
		Scanner c=new Scanner (System.in);
		
		System.out.println("programme is started ,,,");
		
		//ex 1 arithmec exeption 
	   
		System.out.println("enter a number : ");
		int num = c.nextInt();
		
		//user enter 0 , arithmec exeption 
		try { 
		System.out.println(100/num); } //the line tht supose the user can false on it ;provide 0 , give exeption 
		
		catch (ArithmeticException e)//identife which type of exeption; 
		{ System.out.println("invalid data");}
		//when i dont know what type of exeption i will have , i can write multiple line of catch block with multiple type 
		
		
		System.out.println("programme is complet ,,,");
		System.out.println("programme is exited ,,,");
	}

}
