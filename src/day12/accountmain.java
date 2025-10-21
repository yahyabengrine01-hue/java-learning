package day12;

public class accountmain {

	public static void main(String[] args) {
      account acc1=new account();//without private we ccses to all variables and data on the class ;
		//but with private al data are not visible here , 
     
      acc1.setAccouno(12);
	  acc1.setName("ayman");
	  acc1.setAmount(1222);
	  
	  System.out.println(acc1.getAccouno());
	  System.out.println(acc1.getName());
	  System.out.println(acc1.getAmount());
		
	}

}
