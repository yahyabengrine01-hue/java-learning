package day4;

public class printweeknumberbasedweekname {

	public static void main(String[] args) {
		//print week number based week name
		String weekname="Tuesday";
		System.out.println("print week number based week name : ");
		
		switch (weekname)
		{
		case "monday":System.out.println("1"); break;
		case "Tuesday":System.out.println("2 "); break;
		case "Wednesday":System.out.println("3"); break;
		case "Thursday":System.out.println("4"); break;
		case "Friday":System.out.println("5"); break;
		case " Saturday":System.out.println("6"); break;
		case "Sunday.":System.out.println("7"); break;
		default :System.out.println("it s no day has this number"); 
		

	}
	}

}
