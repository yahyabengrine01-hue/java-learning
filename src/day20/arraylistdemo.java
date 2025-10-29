package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistdemo {

	public static void main(String[] args) {
		
		//declaration 
		//ArrayList mylist =new ArraList(); //then import arraylist class ; 
		//List mylist =new ArrayList();     //this is also correct list is parent class 
		//ArrayList<Integer> mylist =new <Integer>ArraList();//if i want store only integer type of data ; 
		 
		ArrayList mylist =new ArrayList();
		
	    //adding data into arraylist
		
		mylist.add(11);
		mylist.add(22.1);
		mylist.add("pedro");
		mylist.add(true);
		mylist.add(11);//duplacate allowed 
		
		//size of arraylist 
		//mylist.size());
		System.out.println("size of arraylist is : " +mylist.size());
		
		//printing arraylist 
		System.out.println("printing data from array list : "+mylist);
		
		//remove element from arraylist ; 
		mylist.remove(4);
		System.out.println("printing data from array list after removing : "+mylist);
		
		//insert element in the arraylist 
		mylist.add(2,89);
		System.out.println("printing data from array list after insert:"+mylist);
		
		//modify element
		mylist.set(2, 90);
		System.out.println("printing data from array list after replacing:"+mylist);
		
		//access sepcific element
		System.out.println(mylist.get(3));
		
		//reading all elements from arraylist
		
		//1;using normal for loop 
		
		for (int i=0;i<mylist.size();i++)
		{System.out.println(mylist.get(i)); }
		
		//2;using enhanced loop/for each loop
		for(Object x:mylist)
		{ System.out.println(x); }
		
		//using iterator
		Iterator it=mylist.iterator();//ater write line of itrator import iterator from java util package ;
		 
		while (it.hasNext())//line check if true print if false end printing 
		{ System.out.println(it.next());}//print value and go to next element after checking 
		
		//checking arraylist is empty or not;
		System.out.println("arraylist is empty :"+ mylist.isEmpty());
		
		//remove all the elements from arraylist
		
		//if i want remove single element mylist.remove(); is the availabel 
		//if i want to remove all elements ; mylist.clear();is availabel 
		//if i want multiple or specific elements ; this the way 
		
		ArrayList mylist2 =new ArrayList();
		mylist2.add(11);
		mylist2.add("pedro");
		mylist.removeAll(mylist2);
		System.out.println("after removing multiple elements :"+mylist);
		
		//remove all elements ;
		 mylist.clear();
		 System.out.println("arraylist is empty :"+ mylist.isEmpty());
		 
		
		
		
		
		
		
		
		
		
		
	}
	

}
