package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class hashsetdemo {

	public static void main(String[] args) {
		
    //declaration 
		//HashSet myset=new HashSet();
		//Set myset=new HashSet();
		//HashSet <String>myset=new HashSet<String>();
		
		HashSet myset=new HashSet();
		
		//adding elements into hashset 
		myset.add(100);
		myset.add("welcome");
		myset.add('a');
		myset.add(10.30);
		myset.add(100);//allows when duplacet 
		myset.add(null);
		myset.add(null);//alows when set nulls /but when run time 
		//order not allowed ; duplicate elements not allowed; duplicat nulls not allowed; 
		
		//printing hashset
		System.out.println(myset);//[null, a, 100, welcome, 10.3]
		
		//remove element
		
		myset.remove("welcome");//removing element by enter the value direct ;
		System.out.println("afet removing:"+myset);//[null, a, 100, 10.3]
		
		//inserting element /is not possible in hashmap , bcs no element has a serten place 
		
        //access specific element /not possible 
		//we can but with : convert hashset to arraylist 
		ArrayList ha=new ArrayList(myset);
		System.out.println(ha);//[null, a, 100, 10.3]
		System.out.println(ha.get(2));//100
		
		//read all elements using for "normal for loop " ; not possible bcs it is no index ; 
		//read all elements using for .. each 
		for (Object x:myset)
		{ System.out.println(x);}
		
		//using iterator .
		
		Iterator it=myset.iterator();
		while (it.hasNext())
		{ System.out.println(it.next());}
		
		//size of hashset
		System.out.println(myset.size());
		
		//clear all value in hashset; 
		myset.clear();
		System.out.println(myset.isEmpty());
		
		
		
		
		
	}

}
