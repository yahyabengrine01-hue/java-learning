package day7;

public class searchelementinarray {

	public static void main(String[] args) {
		
		int a[ ]={10,20,30,40,50 }; 
		int searchelement=90;
		boolean statut=false;   //false :not found / true : found ; 
		
		/* for (int i=0;i<a.length;i++)
		{ 
			if (a[ i]==searchelement)
			{  System.out.println("element found");
			statut=true;
			break;} 
			
		}
		 if(statut==false) //this is thee second if separate from first if ; 
		{  System.out.println("element not found");}*/
		
		
		for (int X:a) //with enhanced loop ;
		{ 
			if (X==searchelement)
			{  System.out.println("element found");
			statut=true;
			break;} 
			
		}
		 if(statut==false) //this is thee second if separate from first if ; 
		{  System.out.println("element not found");}
		 
		 

	}

}
