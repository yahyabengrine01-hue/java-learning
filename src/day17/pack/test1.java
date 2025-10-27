package day17.pack;

public class test1 {

	//private ; if we write private as a access modifier , we can only access within the class
	
	/*
	 private int x=11;
	 private void i1()
	{ System.out.println("this is i1 from test1 ");} */
	
	
	//default ; this default only within the package we can access
	
	/*int x=11;
	void i1()
	{ System.out.println("this is i1 from test1 ");}*/
	
	//protected ; we can access within the class and package and outside the packge only as a subclass with inheritance after importe class  
	//make class as a parent class , 
	/*protected int x=11;
	protected void i1()
	{ System.out.println("this is i1 from test1 ");}*/
	
	//public ; direct access evrey data everywhere 
	
	public int x=11;
	public void i1()
	{ System.out.println("this is i1 from test1 ");}
	
	

	
}
