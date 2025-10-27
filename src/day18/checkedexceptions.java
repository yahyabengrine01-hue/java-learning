package day18;

public class checkedexceptions {

	public static void main(String[] args) throws InterruptedException {
	   System.out.println("program started,,,");
	   System.out.println("program in progress,,,");
	   //Thread.sleep(2222); hna checkat blli promblem 9bel mn texcecuta programe stop 
	   
	   //1 handle checkedexceptions using try catch 
	   
	   /*try{ 
	   Thread.sleep(2222); //hadi method f java mn class m3naha anna program ghatw9f dak l3adad dyal tawani wghaykmel
	   }
	   
	   catch (Exception e)
	   { }*/
	   //wakha tb9a khawya machi mochkil
	   
	   //2 handle checkedexceptions using throw
	   
	   Thread.sleep(2222);//just we go with mouse to this line and it give us automaticly which way to handle if we chouse throw ; 
	                      //ghatzad lfo9 fline dyal public , prob solve 
	   
	   
	   System.out.println("program fin,,,");
	   System.out.println("program ex,,,");
	   

	}

}
