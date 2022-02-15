package com.josh.Collections;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args)
	{
		TreeSet<String> set= new TreeSet<>();
		set.add("zoo");
		set.add("giraffe");
		set.add("apple");
		set.add("elephant");
		set.add("lion");
		set.add("monkey");
		
		System.out.println("Printing elements in Default natural sorting order");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		TreeSet<String> desc= new TreeSet<>((a,b)->(b.compareTo(a)));
		
		desc.add("zoo");
		desc.add("giraffe");
		desc.add("apple");
		desc.add("elephant");
		desc.add("lion");
		desc.add("monkey");
		
		System.out.println("printing elements in descending order");
		itr=desc.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
}
