package day11;

public class construtordemo {int x,y;

construtordemo() //default constructor
{x=100;
 y=200;
}

construtordemo(int a, int b)//paramarized constructor
{ x=a;
  y=b;}

void sum()
{ System.out.println(x+y);}


	public static void main(String[] args) {
		
		//construtordemo cd=new construtordemo(); //invoke defoult constructor 
		construtordemo cd=new construtordemo(10,20); // paramarized constructor
		cd.sum();
		
	}

}