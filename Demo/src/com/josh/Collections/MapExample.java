package com.josh.Collections;

import java.util.*;

public class MapExample {

	public static void main(String[] args)
	{
		Map<Integer,String> map= new HashMap<>();
		map.put(1, "Akhil");
		map.put(2, "Chandan");
		map.put(3, "Kratagya");
		map.put(4, "Nitin");
		map.put(5, "Yash");
		
//		System.out.println("roll no 1"+ map.get(1));
//		System.out.println("roll no 3"+map.get(3));
		
		map.forEach((k,v)->System.out.println("key ="+k+" value ="+v));
		
	}
}


//functional interface
//lambda expression
//for each
//default
//static
//stream api