package day13;

public class thiskeywoed {//creat varaibles here called class variables or instance variables ; 

	 int x,y;
	  thiskeywoed (int x , int y ) //this is local vaibels also acses just within this methods 
	  {
		  this .x=x;    //this main this from class 
		  this .y=y;
	  }
	  
	
	  void display ()
	  {
		  System.out.println(x);
		  System.out.println(y);
	  }
	  public static void main(String[] args) {
		//creat varaibles here called local variables
		
		  thiskeywoed th = new  thiskeywoed(11,22);//if i dont set data here i must do another method call void setdata and it in the next line 
		  th.display();
	  }
}
