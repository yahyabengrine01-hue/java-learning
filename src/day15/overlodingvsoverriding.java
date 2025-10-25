package day15;

class abc 
{
	void m1(int a)
	{ 
		System.out.println(a);
	}
	void m2(int b)
{
	System.out.println(b);
	}
}

class xyz extends abc
{ 
	void m1(int a)//overriding
	{ 
		System.out.println(a+a);
	}
	void m2(int b)//overriding
	{
		System.out.println(b+b);
		}
	void m2(int a,int b)//overloading
	{
		System.out.println(a+b);
		}
	//in overriding changing declaration , in overloading changing declaration, 
	//overloading is poly valannce concepts
}

public class overlodingvsoverriding {

	public static void main(String[] args) {
		xyz xy=new xyz();
		xy.m1(11);
        xy.m2(22);
        xy.m2(22,33);
	}

}
