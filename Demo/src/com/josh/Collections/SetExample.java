package com.josh.Collections;

import java.util.*;
public class SetExample {
	
	public static void main(String[] args)
	{
		Set<String> hs= new HashSet<>();
		
		hs.add("Welcome");
		hs.add("Hello");
		hs.add("Hiii");
		hs.add("morning greetings");
		
//		Iterator<String> itr=hs.iterator();
//		
//		System.out.println("printing set elements");
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
//		System.out.println("adding duplicate element to set");
//		System.out.println(hs.add("Welcome"));
//		
//		System.out.println(hs);
		
		hs.forEach((n)->System.out.println(n));
		
	}
}
