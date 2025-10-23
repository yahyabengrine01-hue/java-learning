package day14;
class parents 
{ 
	void display (int a)
	{ 
		System.out.println(a);
	}
}

class child1 extends parents
{ void show (int b)
{ System.out.println(b);}
}

class child2 extends parents
{void watch (int c)
{ System.out.println(c);}}


public class hierarchyinheritance {

	public static void main(String[] args) {
		
		child1 b1=new child1();
		b1.display(11);//methods from parents class 
		b1.show(13);//methods from child1 class 
		
		child2 c1=new child2();
		c1.display(112);//methods from parents class 
		c1.watch(143);//methods from child2 class 
		
		
		
	}

}
