package day15;
class test2
{ 
	int y=22;
final void m1()
{System.out.println("this is method ;;;"); }
}

class test3 extends test2
{
	int y=22+2;
	//void m1()//incorrect bcs m1 is final method 
	{System.out.println("this is method2 ;;;"); }
	}

final class test4
{ 
	int z=22;
final void m2()
{System.out.println("this is method ;;;"); }
}

/*class test5 extends test4 //we cant use test4 as parents bcs its a final class 
{ 
	int w=22;
}*/



public class finalkeyword2 {

	public static void main(String[] args) {
	

	}

}
