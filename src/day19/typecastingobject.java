package day19;

class parent 
{ 
	String name = "john ";
	void m1()
	{ System.out.println("this is m1 from parent");}
}

class child extends parent
{ int id =12;
void m2()
{System.out.println("this is m1 from parent");}
}

public class typecastingobject {

	public static void main(String[] args) {
	   
		child c =new child();
		
		System.out.println(c.name);
		System.out.println(c.id);
		c.m2();
		c.m1();
		
		parent p =new child(); //upcasting 
		
		p.m1();
		System.out.println(p.name);
		//but cant access child class in upcasting ; 
		
		//downcasting from larger to smaller 
		parent pa= new parent();
		child ci=(child)pa;
		//on the run time we will have a exception 
		System.out.println(ci.name);
		System.out.println(ci.id);
		ci.m2();
		ci.m1();
		
		/*child c =new child();//when i know what i want to call 
		parent p =new child(); //when i dont know what i call //access everything from parent not child 
		
		*/
		
		
		
		
	}

}
