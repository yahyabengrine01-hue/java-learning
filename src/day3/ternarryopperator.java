package day3;

public class ternarryopperator {

	public static void main(String[] args) {
		//ex1
		int A=200,B=100;
		int x=(A>B)?A:B;
		System.out.println(x);
		
		//ex2
		int y=(B>A)?A:B;
		System.out.println(y);
		
		//ex3
		int z=(100==100)?120:150;
		System.out.println(z);
		
		//ex4
		int personAge=19;
		String elli=(personAge>=18)?"this person can vote":"this person can t vote";
		System.out.println(elli);
		
		
		
	}

}
