package day7;

import java.util.Arrays;

public class sortingelementsinarray {

	public static void main(String[] args) {
		int a[]={500,100,600,200,400 };
		
		System.out.println("befor sortin order,,,,");
		System.out.println(Arrays.toString(a)); //this is short cut
		
		/*System.out.println("befor sortin order,,,,"); // we dont need this ;
		for (int value:a)
		{ System.out.print(value);} */
		
		Arrays.sort(a); //sort element in array 
		System.out.println("after sortin order,,,,");
		System.out.println(Arrays.toString(a));
		
		

	}

}
