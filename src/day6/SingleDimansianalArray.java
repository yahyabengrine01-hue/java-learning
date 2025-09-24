package day6;
//1 declar array 
//2 add value into array 
//3 find size of array 
//4 red single value from an array
//5 read multiple value from an array 
public class SingleDimansianalArray {

	public static void main(String[] args) {
		
		//approach 1 ;
		int a[]= new int [5]; //declar array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		//we use this first approach when we kwon how many value we have , and we dont need add more value in the futur,rarly to  use 
		
	   //approach2 ; 
		int b[ ] = {100,200,300,400,500};
		
	   //find legnth od array ;
		System.out.println("length of an array :"+b.length);
		
	   //read single value from an array , 
		System.out.println(b[3]);  
		
		//reading all values from array.
		//normal loop 
		for(int i=0;i<= b.length-1;i++)//i<=4 or i<5 or i<b.length or i<= b.length-1;
		 {System.out.println("reading all values from array."+b[ i]);
		 } 
		
		//enhanced for loop / for each loop ;
		for(int c:b)
		{ System.out.println(c);}
		
		
		
		

	}

}
