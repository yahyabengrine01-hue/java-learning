package day16;

interface shape
{ 
	int lenght=11;//final and static 
	int width=12;
	void circle ();//abstract 
	//if we want creat normal method ,we must declare default first 
	default void square()
	{ System.out.println("this is  default,,,,");}
	static void rect()
	{ System.out.println("this is static ,,,,");}

}
class tree implements shape
{ 
	public void circle()//daroori public befor declaration
	{System.out.println("after we put implament here tree "); }
	}



public class interfacedemo implements shape {
	public void circle()
	{ System.out.println("after we put implament here interfaecdemo ");}
	void tri()
	{ System.out.println("normal method  ");}
	int a=12;
	int b=23;
	
	public static void main(String[] args) {
		
		//scenario  ; 1, 
		interfacedemo idm=new interfacedemo();
		idm.circle();
		idm.square();
	   shape.rect();//declare the interface name class when you call static method from interface 
		idm.tri();
		System.out.println(lenght+width);
		System.out.println(idm.b+idm.a);
		
		shape si=new interfacedemo();
		si.circle();//abstarct
		si.square();//default
		shape.rect();//static
		//si.tri();/error bcs it dosnt from interface shape 
		System.out.println(lenght+width);
		//System.out.println(a+b);/error bcs it dosnt from interface shape 
		
		shape s1=new tree();
		s1.circle();
	}

}
