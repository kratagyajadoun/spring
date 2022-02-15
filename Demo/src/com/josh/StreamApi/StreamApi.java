package com.josh.StreamApi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class StreamApi {

	
	public static void main(String[] args)
	{
		List<Integer> l= new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(35);
		l.add(123);
		l.add(11);
		l.add(1090);
		List<Integer> even=l.stream().filter(n->(n%2)==0).collect(Collectors.toList());
		
		System.out.println(even);
	}
}
