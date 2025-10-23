package day13;

public class staticdemo {static int a=10; 
int b=12;
static void m1()//static method 
{ 
	System.out.println("this is static method ,,, ");
}
void m2()//non static method 
{ 
	System.out.println("this is non static method ,,, ");
}

void m()//non static method 
{ 
	System.out.println(a);
	System.out.println(b);
	m1();
	m2();
	}
	public static void main(String[] args) {
		
		//static method can access static stuff directly (without pbject)  like this 
		/*System.out.println(a);
		m1();
		
		//nonstatic cannot access without object like static , 
		//System.out.println(b);
		//m2();
		
		//static method can access on static stuff through object 
		staticdemo st=new staticdemo ();
		System.out.println(st.b);
		st.m2();
		st.m(); */  //becouse i creat object i can access the two type without probleme,
		
	}
	 }


