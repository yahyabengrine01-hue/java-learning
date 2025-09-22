 package day5;

public class whileloopdemo {

	public static void main(String[] args) {
		// ex1: print 1 to 10 number ,
		/*int i=1;  //initialization 
		while(i<=10)   //condition
		 {System.out.println(i);
			 i++;
		 } //inc*/
		 // until the condition is true the loop works and not stop 
		 
		
		//ex2 : print hello 10 times ;
		 /*int i=1;
		 while(i<=10)
		 {System.out.println("hello");
		 i++;
		 }*/
		
		
		//ex3: print even number between 1 to 10 ; 
		/*int i=2;
		while(i<=10)
		 {System.out.println(i);
		 i=i+2;
		}*/
		
		
		//ex3:make it with if ; 
		/*int i=2;
		while(i<=10)
		 {if(i%2==0) // like filter here , 
			System.out.println(i);
		 i++;
		}*/
		
		
		//ex4:print 1to 10 like this 1 : odd;2 even ,,,,,,,
		/*int i=1;
		while(i<=10)
		{if (i%2==0)
			System.out.println(i+" is even");
		else
		{System.out.println(i+" is odd");}
		i++;
			
		}*/
		
		//ex5: print 10 to 1 
		int i=10;
		while (i>=1)
		{System.out.println(i);
		i--;
		}
		
		
		
	}

}
