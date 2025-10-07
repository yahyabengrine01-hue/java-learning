package day8;

import java.util.Arrays;

public class stringmethod {

	public static void main(String[] args) {
		
		String s="welcome";
		//length () return lenth of string ; (number of charachters ); 
		int l =s.length();
		System.out.println(l);
		System.out.println("welcome".length());//we can also do like this 
		//concat : joining strings , 
		String s1= "welcome";
		String s2= " TO JAVA ";
		String s3= " automation ";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));// we can also write like this 
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));//combination cancta and (+),
		System.out.println("welcome".concat(s2+s3));//string and concat 
		
		//trim : remove spaces right and left side  ; 
		s="   welcome   ";
		System.out.println(s);//print wth spaces 
		System.out.println(s.trim());//wthout spaces 
		 
		System.out.println("befor trimming : "+s.length());
		System.out.println("after trimming : "+s.trim().length());
		
		//charAt() : returns a character from a string based on index 
		s="welcome";
		System.out.println(s.charAt(3));
		
		//contains () ; returns true or false, after check string is part of main string or not 
		System.out.println(s.contains("wel"));//if wel part of s the answer will be ; true 
		System.out.println(s.contains("Wel"));// false
		
		//equals() , equalsIgnoreCase()
		
	    s1="welcome";
	    s2="welcome";
	    System.out.println(s1==s2);//true 
	    System.out.println(s1.equals(s2));//true 
	    System.out.println(s1.equals("welcome"));//true 
		
	    System.out.println(s1.equals("Welcome"));//false
	    System.out.println(s1.equalsIgnoreCase("welcome"));//true // 
	    
	    //replace (); reolase singe or multiple (sequance) of charachter in a string 
	    
	    s="welcome to a new world when the new ai play a big new role ";
	    System.out.println(s.replace('e', 'o'));
	    System.out.println(s.replace("new", "old"));
	    
	    //substring() ; extract substring from the main string ; 
	    
	    s="welcome ";
	    System.out.println(s.substring(3,6));//com 
	    
	    // toUpperCase () ; toLowerCase() , 
	    
	    System.out.println(s.toUpperCase());//WELCOME 
	    System.out.println(s.toLowerCase());//welcome 
	    
	    //split(); split the string into multiple parts based on delimeter ; 
	    s="java@gmail.com"; 
	    
	    System.out.println(s.split("@"));
	    String a[ ]=s.split("@");// we should do array 
	    System.out.println(a[0]);//java 
	    System.out.println(a[1]);//gmail.com
	    System.out.println(Arrays.toString(a));//[java, gmail.com]
	    
	    //ex1; extarct 154590
	    String amount ="$15,45,90";
	    //String b[ ]=amount.split(",");
	    //System.out.println(b[1]);
	    //System.out.println(amount.substring(1,9)); //15,45,90 
	    //System.out.println(amount.replace("$","")); //15,45,90
	    System.out.println(amount.replace("$","").replace(",", "")); //154590
	    
	    //ex2; 
	    s="java,433@gmail"; //extarct// java 433 gmail 
	    String c1[ ]=s.split(",");
	    System.out.println(Arrays.toString(c1));//[java, 433@gmail]
	    String c2[ ]=c1[1 ].split("@");
	    System.out.println(Arrays.toString(c2));//[433, gmail]
	     
	    System.out.println(c1[ 0]);//java
	    System.out.println(c2[ 0]);//433
	    System.out.println(c2[ 1]);//gmail
	    
	    //ex3 
	    // % () & * you cannot use as delimiter 
	     s="abc 123 oop";
	     String arr[ ]=s.split(" ");
	     System.out.println(Arrays.toString(arr));//[abc, 123, oop]
	     
	     //ex4 ,
	     String name = "lio messi"; 
	     System.out.println(name.contains("Lio"));// false L is upper charachter 
	     System.out.println(name.replace("l", "L").contains("Lio"));

	    
	    
	    
	    
	}

}
