package day12;

public class addermain {

	public static void main(String[] args) {
		adder addobj= new adder();
		
		addobj.sum();//1
		
		addobj.sum(20,30);//2
		
		addobj.sum(299,38,40);//5
		
		addobj.sum(2.3,4);//4
		
		addobj.sum(4,2.3);//3
		
		//addobj.sum(299,38,40,22);//invalid we di-ont have any object with this 
		
		
		

	}

}
