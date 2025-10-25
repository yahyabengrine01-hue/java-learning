package day15;

class test1
{ final int x =100;
	}

public class finalkeyword {

	public static void main(String[] args) {
		
		test1 t1=new test1();
		//t1.x=200;// cant change like normal varaible bcs we put final keyword 
		System.out.println(t1.x);
		
		

	}

}
