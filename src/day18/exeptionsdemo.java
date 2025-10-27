package day18;

import java.util.Scanner;

public class exeptionsdemo {

	public static void main(String[] args) {
		
		Scanner c=new Scanner (System.in);
		
		System.out.println("programme is started ,,,");
		
		//ex 1 arithmec exeption 
	    /*System.out.println("enter a number : ");
		int num = c.nextInt();
		//user enter 0 , arithmec exeption 
		System.out.println(100/num); //provide 0 , give exeption */
		
		//ex 2 ArrayIndexOutOfBoundsException
		/*int a[ ]=new int [ 5];
		System.out.println("enter the posetion(0 to 4) : ");//enter 5 or more , is exeption 
		int pos=c.nextInt();
		
		System.out.println("enter value :");
		int val=c.nextInt();
		
		a[ pos ]=val; //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);*/
		
		//ex3NumberFormatException
		
		/*String e="wel";//when we put not number 
		int r= Integer.parseInt(e);//NumberFormatException
		System.out.println(r);*/
		
		//ex 4 NullPointerException
		//String q="welcome"; //no problem 
		String q=null; //null no value here 
		System.out.println(q.length());
		
		
		System.out.println("programme is complet ,,,");
		System.out.println("programme is exited ,,,");
		
		
	}

}
