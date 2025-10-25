package day15;

public class animalsuperkeyword {
	String color="white ";
	void eat()
	{System.out.println("eating ,,, "); }
}
class dog extends animalsuperkeyword
{ 
	String color="black";
	
	void display()
	{  System.out.println(super.color);
	}
	void eat()
	{System.out.println("eating fish ,,, "); 
	super.eat();}
	
	
	}

