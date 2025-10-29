package day20;

import java.util.HashMap;
import java.util.Iterator;

public class hashmapdemo {

	public static void main(String[] args) {
	
		//declaration 
		//if want to specific type of data ; 
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		
		//HashMap hm=new HashMap();
		//adding pairs 
		hm.put(11,"rafa");
		hm.put(12,"flick");
		hm.put(21,"dejohng");
		hm.put(22,"attt");
		hm.put(11,"rafa");//duplicate key not allawed
		hm.put(10,"rafa");//duolicate value is allawed
		
		System.out.println(hm);
		
		//siz of hashmap
		System.out.println("size of hashmap:"+hm.size());
		
		//remove pair
		hm.remove(11);
		System.out.println("after removing"+hm);
		
		//access value of the key
		System.out.println(hm.get(21));
		
		//get all the keys from hashmap 
		System.out.println(hm.keySet());//[21, 22, 10, 12]
		
		//get all the values from hashmap 
		System.out.println(hm.values());//[dejohng, attt, rafa, 22]
		
		//get all the keys and the values from hashmap 
		System.out.println(hm.entrySet());//[21=dejohng, 22=attt, 10=rafa, 12=22]
		
		//reading data from hashmap 
		
		//using for ..each loop //this prefer in hashmap 
		
		for(int k:hm.keySet())//makanch ghaykhdem kon ma7weltch declaration l <inreger,string>
		{ System.out.println(k+"   "+hm.get(k));}
		
		//using iterator //complecated
		/*Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		while;;
		;;;
		*///
		
		//clear all data 
		hm.clear();
		System.out.println("is hashmap is emty "+hm.isEmpty());
		
	}

}
