package day15;

class bank
{ 
	double r()
{ 
	return 0;
	           }
	}
class ici extends bank
{
	double r()
	{ 
		return 10.5;
		           }
	}
class ibi extends bank 
{ 
	double r()
	{ 
		return 11.5;
		           }
	}




public class overridingdemo {

	public static void main(String[] args) {
	
		ici ic=new ici ();
		System.out.println(ic.r());//value of ici 
		
		ibi ib=new ibi ();
		System.out.println(ib.r());//value of ibi 

	}

}
