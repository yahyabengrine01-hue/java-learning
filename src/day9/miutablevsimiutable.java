package day9;

import java.util.Arrays;

public class miutablevsimiutable {

	public static void main(String[] args) {
		
		//mutable ; we can change , 
		
		int a[]={10,20,50,30,40 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//this method change th array , tats why it is mutable 
		System.out.println(Arrays.toString(a));
		
		// immutable ; we cannot change  ,  cant change the value of the originale , 
		
		String s=new String("welcome");
		System.out.println(s);
		s.concat("to the world");
		System.out.println(s);
		 
		
		
		
		
		
	}

}
