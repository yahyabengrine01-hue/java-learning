package day9;

public class stringcomparason {

	public static void main(String[] args) {
	
		// case 1
		
		String S1="welcome ";
		String S2="welcome ";
		System.out.println(S1==S2);//true 
		System.out.println(S1.equals(S2));//true 
		//it s no deferant we can use what we want between this two;
		
		// case 2
		
		String A1=new String("welcome ");
		String A2=new String ("welcome ");
		System.out.println(A1==A2);//false //to compare the object  because we use keyword of new ; 
		System.out.println(A1.equals(A2));//true //to compare values of the pbjects 
		
		//case 3
		
		String e="java ";
		String r=new String ("java ");
		System.out.println(e==r);//false
		System.out.println(e.equals(r));//true 
		
		//case 4
		
		String z="java ";
		String w=new String ("java ");
		String t=w;
		
		System.out.println(z==w);//false
		System.out.println(z.equals(w));//true 
		
		System.out.println(w==t);//false
		System.out.println(w.equals(t));//true 
		
		
	}

}
