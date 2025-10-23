package day14;

class A //yes we can do onther class like this but without using writing public class 
{ 
	int a=100;
	void display ()
	{  System.out.println(a);}
}

class B extends A //A is parrent for B, and B have now the of A and his own data 
{  
int b =200;
void show ()
{ System.out.println(b);}
}

class C extends B 
{ 
	int c =300;
	void multi()
	{System.out.println(c);}
} 






public class inheritancetypes {

	public static void main(String[] args) {
		
		// 1 , this is call: single inherintance ;
		B bb=new B(); //B can access B and A classes , 
		bb.display();
		bb.show();
		System.out.println(bb.b);
		System.out.println(bb.a);
		
		//2 multilevel inherintance ; 
		C cc=new C();  // C can access to B + A ,becouse B access to A , 
		cc.multi();
		System.out.println(cc.c);
		bb.display();
		bb.show();
		System.out.println(bb.b);
		System.out.println(bb.a);
		
		
	}

}
