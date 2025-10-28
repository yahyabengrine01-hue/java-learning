package day19;

//upcasting , converting value from smaller type  to larger type ,
// int to long / float to double

//downcasting , converting value from latger type to smaller type ,
//long to int / double to float ;

public class typecasting {

	public static void main(String[] args) {
		
		//upcasting , automatic prossec 
		
		int v=12;
		long z=v;
		System.out.println(z);
		
		
		//downcasting ,
		int e=12;
		double r=e;
		System.out.println(r);
		
		//downcasting , manualy ,
		
		long t=12222;
		int y=(int)t;
		System.out.println(y);
		
		double u=12.8777;
        float o=(float)u;
        int uy=(int)u;
        System.out.println(uy+o);
        System.out.println(uy);
		
		
		
		
	

	}

}
