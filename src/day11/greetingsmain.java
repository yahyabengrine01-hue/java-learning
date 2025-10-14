package day11;

public class greetingsmain {

	public static void main(String[] args) {
		
		greetings gr=new greetings();
		gr.m(); //hello .this is just printing not return value 
		
		String s=gr.m2();
		System.out.println(s);
		
		gr.m3(" pedro");
		
		String var =gr.m4(" noah");
		System.out.println(var);
	}

}
