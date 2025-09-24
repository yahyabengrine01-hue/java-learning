package day6;

public class twomultipledimensionalarray {

	public static void main(String[] args) {
		/* 1 declar array 
		 * 2 add value into array 
		 * 3 find size of an array 
		 * 4 read single value from an array 
		 * 5 read multiple value from an array 
		 */
		 
		//1 declar array 
		//2 add value into array 
		//approach 1 , when know how mich data have , and dont need to add more data in futur, 
		
		int a[ ][ ]= new int [3][2];  
		a[0][0]=100;
		a[1][0]=200;
		
		a[2][0]=300;
		a[0][1]=400;
		
		a[1][1]=500;
		a[2][1]=600;
		//System.out.println(a[2][1]);
		
		//approch 2
		int b[ ][ ]= {{100,200} ,{300,400} , {500,600}};
		
		//3 find size of an array  
		System.out.println("length of rows "+b.length);
		System.out.println("length of colums "+b[ 0].length);
		
		//4 read single value from an array
		System.out.println(b[2][0]);
		
		//5 read all multiple value from an array
		
		//normal for
		for(int r=0;r<=2;r++) //rows
		{ 
			for (int c=0;c<=1;c++) //colums
			{ System.out.println(b[r][c]+"  ");}
		     System.out.println();// we can dont use this lin e, this just for show m9addin , each two with other
		}
	   //enhanced for loop 
		for(int arr[ ]:b) //here b come to give the number of length ,than come the loop  
		{ 
			for (int y:arr) //a give the value to arr , arr give to y , than show this 
		{ System.out.println(y+"  ");} 
			System.out.println();           }
		
		

	}

}
