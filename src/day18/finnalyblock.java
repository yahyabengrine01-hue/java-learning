package day18;

public class finnalyblock {

	public static void main(String[] args) {
System.out.println("programme is started,,,");
		
		String q="eee"; //null no value here 
		
		
		try {System.out.println(q.length());}
		
		
		
		catch (Exception e)//i can write just this commend without write all those multiple type and line of catch 
		{System.out.println("try again data not valid ");
		System.out.println(e.getMessage());}//method print the details of exception }
		
		finally //even we put another false exeption in catch block the finnaly willl excuted the other lines are not
		{ System.out.println("finnaly block ,,,,");}
        
		System.out.println("programme is finished,,,");
		

	}

}
