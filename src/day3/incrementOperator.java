package day3;

public class incrementOperator {

	public static void main(String[] args) {
		// ++ called incerement operator , 
		//case 1
		/*int a=10 ;
		System.out.println(a);
		 a++;//a=a+1
		System.out.println(a);*/
		//case 2 post increment 
		int a=10;
		int b=a++;
		System.out.println(b);//10 bcs read a first than give result,after that a : it will be 11 
		//a++;
		b=a++;
		System.out.println(b);
		System.out.println(a);
		System.out.println(a);
		a++;
		System.out.println(a);
		//case 3; pre increment , 
		int c=10;
		int h=++c;
		System.out.println(h);
		
				
		
		
		
		
	}

}
