package day13;

public class staticmain {
public static void main(String[] args) {
		
		//when separate class give me an error for the static 
		//System.out.println(a);
		//m1();
		//the solution just we put the name of the class from 
		System.out.println(staticdemo.a);
		staticdemo.m1();
		
		
		//System.out.println(b);
		//m2();
		
		//static method can access on static stuff through object 
		staticdemo st=new staticdemo ();
		System.out.println(st.b);
		st.m2();
		st.m();  //becouse i creat object i can access the two type without probleme,
      }

}
