package day17;

public class dataconvertionmethods {

	public static void main(String[] args) {
	
		//string to int 
		
		String s="122";
	    int s1= Integer.parseInt(s);
		System.out.println(s1);
		
		String z="211";
		System.out.println(Integer.parseInt(z)+2);
		
		//string to double ; same thing ;
		//double.parsedouble(s);
		
		//string to char ; imposible; 
		
		//string to boolean ;
		
		String A="black"; //if i wrote true return true if write false return false , if write anything else returne false boolean , 
		System.out.println(Boolean.parseBoolean(A));
		
		
		//int , bool , double to string format ,
		
		int e=10;
		double r=12.3;
		char q='z';
		boolean t=true;
		
		//String.valueof(); convert any of data type to string; 
		String T = String.valueOf(e);
		System.out.println(String.valueOf(T));
		
		System.out.println(String.valueOf(q));
		System.out.println(String.valueOf(r));
		System.out.println(String.valueOf(t));
		
		/*autoboxing	تحويل تلقائي من primitive → object	Integer obj = 5;
		 
          Unboxing	تحويل تلقائي من object → primitive	int num = obj;*/
		
		int a = 10;
		Integer b = a;  // Java automatically does Integer.valueOf(a)
		
		Integer c = 20;
		int d = c;  // Java automatically does c.intValue()
		
		//important for collections and array list , 
		
	}

}
