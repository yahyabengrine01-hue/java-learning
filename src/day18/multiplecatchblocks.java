package day18;

public class multiplecatchblocks {

	public static void main(String[] args) {
		
		System.out.println("programme is started,,,");
		
		String q=null; //null no value here 
		
		
		try {System.out.println(q.length());}
		
		/*catch (ArithmeticException e){System.out.println("try again data not valid ");
		System.out.println(e.getMessage()); }
		
		catch (NullPointerException e)
		{System.out.println("try again data not valid "); 
		System.out.println(e.getMessage());}
		
		catch (NumberFormatException e){System.out.println("try again data not valid ");
		System.out.println(e.getMessage());}*/
		
		catch (Exception e)//i can write just this commend without write all those multiple type and line of catch 
		{System.out.println("try again data not valid ");
		System.out.println(e.getMessage());}//method print the details of exception }
		
        
		System.out.println("programme is finished,,,");
		
	}

}
