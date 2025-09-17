package day3;

public class Oporetorsdemo {

	public static void main(String[] args) 
	{
		//arthimitics operators :  / + - * % 
		int a=20,b=10;
		System.out.println("sum of a,b is : "+(a+b));
		System.out.println("diff of a,b is : "+(a-b));
		System.out.println("multi of a,b is : "+(a*b));
		System.out.println("div of a,b is : "+(a/b));
		System.out.println("modulo of a,b is : "+(a%b));
		
		//relational and comperation operator ;< , =< , > , => , != , == , 
		//returns boolean value , true or false 
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a!=b);// != : not equal ; 
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		b=20; // after b = 20 and a = 20 ; 
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		boolean res =a==b;
		System.out.println("the answer is :"+res);
		
		 //logical operators && ,( !:not) , (|| : x or y )
		// returns boolean value , true or false 
		// works between two boolean values 
		boolean x=a<=b, y=a!=b; //x:true ; y:false, 
		boolean t=true , f=false; // we can also make like this 
		System.out.println(x&&y);
		System.out.println(t&&f);
		System.out.println(x||y);
		System.out.println(!t);
		System.out.println(!f);
		boolean b1=10==20, b2=10==10; // we can also make it like this 
		System.out.println(x&&b2);
		System.out.println(b1||b2);
		System.out.println((100==200)||(200==200)); //we can also do this , 
		//increment and decrement operators ++__ ;
		
		
		
	}

}
