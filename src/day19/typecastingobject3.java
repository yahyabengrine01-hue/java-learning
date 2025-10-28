package day19;

//a x=new b;
//c y=d x;
/*rule 1 : x the same between a and d ;
 * rule 2 : relation between c and d must be the same 
 * rule 3 : relation between b and d must be the same 
*/
public class typecastingobject3 {

	public static void main(String[] args) {
		
		/*ex1
		Object o=new String("welcome");
		StringBuffer sb=(StringBuffer)o;//rule 1 yes /rule 2 yes /rule 3 failded , no relationship between string and stringbuffer */
		
		//ex 2 
		/*String  o=new String("welcome");
		tringBuffer sb=(StringBuffer)o;//rule 1 failed */
		
		//ex 3 
		/*Object o=new String("welcome");
		StringBuffer sb=(String)o; //rule 2 failed*/
		
		//ex 4
		Object o=new String("welcome");
		String sb=(String)o;  //rule 1 yes ; rule 2 yes ; rule 3 yes ; 
		
		System.out.print(sb);
		
		
		
		
		
		

	}

}
