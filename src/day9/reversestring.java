package day9;

public class reversestring {

	public static void main(String[] args) {
		
		//approach 1 ; 
		
		String s="welcome";
		String rev="";
		for(int i = s.length()-1;i>0;i--)
		{ 
			 //System.out.println(s.charAt(i)); // this give every single char on saparate line , 
			rev=rev+s.charAt(i);
			
		}
		System.out.println("reverse of string is :"+rev );
		
		
		//approach 2; without using strig methods / by converting string to char array type 
		String A="java";
		String reve ="";
		
		 char b[]=A.toCharArray();// thats method convert string to array format , 
		for(int i=b.length-1;i>=0;i--)
		{ 
			// System.out.println(b[i]);//kolla char f indivduil line ,
			reve =reve+b[i];
		}
		System.out.println("reverse of string is :"+reve);//avaj
		
		//approach 3 , using stringbuffer class
		
		StringBuffer x=new StringBuffer("hello java");
		System.out.println("reverse of string is :"+x.reverse());//avaj olleh /with using reverse method 
		
		
		
	}

}
