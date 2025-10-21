package day12;

public class overloadingmainmethod {
	
	void main (int x)
{ System.out.println(x);}
	void main (String y)
	{ System.out.println(y);}
	void main (int a, int b)
	{ System.out.println(a+b);}

	public static void main(String[] args) {
		//the only way to accses the main methods is from object and from public ,,, can creat the object
		overloadingmainmethod m1 = new overloadingmainmethod();
		m1.main("mutter");
		m1.main(1);
		m1.main(0+1);

	}

}
