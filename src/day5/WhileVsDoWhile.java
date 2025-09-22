package day5;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		// when even the condition is false do while loop print ones result at least ,but while loop dont print anything
		
		//whileloop
		int i=10;
		while(i<=5)
		{System.out.println(i);
		i++;
		}
		//dowhileloop
		int a=10;
		do
		{System.out.println(a);
		a++;
		}while(i<=5);
	}

}
