package day7;

import java.util.Arrays;
import java.util.Scanner;

public class readingandwritingdataintoarray {

	public static void main(String[] args) {
	
		int a[]= new int[5];
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<a.length;i++)
	{ System.out.println("enter the valuefor the posetion"+i+":");
	 a[i]=sc.nextInt();
	}
	System.out.println("prnting array element");
	System.out.println(Arrays.toString(a));
		

	}

}
