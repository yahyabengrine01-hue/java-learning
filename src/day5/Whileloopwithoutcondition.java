package day5;

public class Whileloopwithoutcondition {

	public static void main(String[] args) {
		// إذا لم تكن متأكداً من عدد التكرارات وكان إيقاف الحلقة يعتمد على شرط، فإن حلقة while خيار جيد.
		//without knowing the condition 
		int i=1;
		while(true)
		{System.out.println("hello world");
			i++ ;
			if(i==10)
		     {break;}
		}

	}

}
