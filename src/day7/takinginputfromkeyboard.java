package day7;

import java.util.Scanner;

public class takinginputfromkeyboard {

	public static void main(String[] args) {
	 Scanner id=new Scanner(System.in );
	
	 
	 System.out.println("give me your id:" ); 
	  int num= id .nextInt();
	
	 System.out.println("your id is "+num ); 
	 
	 Scanner city=new Scanner(System.in );
	
	 System.out.println("enter your city : "); 
	 String c= city.next();
	 System.out.println("your city is : "+c); 
	 
	 
	}

}
 