package day9;

public class stringbuffervsstringbiulder {

	public static void main(String[] args) {
		// string immutable 
		String s ="welcome";
		s.concat("to java");
		System.out.println(s);//immtable cant chang the originale value of s : welcome 
		
		// stringbuffer mutable 
		StringBuffer a= new StringBuffer("new");
		a.append(" week");//this is dosnt work with string its undefined , 
		System.out.println(a);//mutable we can change the originale value of a// new week 
		
		//stringuilder ; mutable 
		StringBuilder b=new StringBuilder ("hello ");
		b.append("world");
		System.out.println(b );//mutable we can change the originale value of b// hello world 
		

	}

}
