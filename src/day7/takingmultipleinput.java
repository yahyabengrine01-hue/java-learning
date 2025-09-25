package day7;

import java.util.Scanner;

public class takingmultipleinput {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in );
     System.out.println("enter first number :");
     int num1=sc.nextInt();
     System.out.println("second first number :");
     int num2=sc.nextInt();
     System.out.println("sum of this is  :"+(num1+num2));
     System.out.println("enter your name :");
     String name=sc.next();//we can work with the same scanner name , even we put deferent data type
     System.out.println(" your name is :"+name);
      //when we have unkown value , 
     System.out.println(" enter your value");
     Object unknown=sc.next();//we can write like this 
     System.out.println(" your value:"+unknown);
     
	}

}
