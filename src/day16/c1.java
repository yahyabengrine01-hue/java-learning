package day16;
//this is call hybrid inheritance
public class c1 extends c2 implements i1,i2 {
	
	public void m1(){ System.out.println(a);}
	
	public void m2(){  System.out.println(b);}
	
	public static void main(String[] args) {
		
		c1 c=new c1();
		c.m1();
		c.m2();
		c.zzz();//from extends c2
		System.out.println(c.z);//from extends c2
		
		

	}

}
