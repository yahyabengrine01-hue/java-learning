package day19;

class animal 
{ }
class dog extends animal 
{ }
class cat extends animal 
{ }

public class typecastingobject2 {

	public static void main(String[] args) {
		
		//rule 1 : concvertion is valid or not check /the type of an and the type of cat mus have relationship 
		animal an =new dog ();
		cat ct=(cat)an; //valid as rule 1; 
		
		//rule 2 : assignment s valid or not /cat must be cat or the child of cat 
		animal am =new dog ();
		cat cz=(cat)am;
		
		animal az=new dog();
		cat at=(dog)az;//rule 1 is valid but rule 2 is not valid ; 
		
		//rule 3 : the underlynig object type of d must be either same  or child of c,
		 animal ae=new animal();
		 cat ce = (cat) an;//run time error //invalid per ule 3; 
		
		 //the tree rules are valid 
		 animal l=new dog();
		 dog y=(dog)l;
		 
		 
		
		
		
		
		

	}

}
