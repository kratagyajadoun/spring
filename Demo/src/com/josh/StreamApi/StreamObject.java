package com.josh.StreamApi;

import java.util.stream.Stream;

public class StreamObject {
	
	public static void main(String[] args)
	{
		String[] names= {"Kratagya","Ankit","Rahul","Sagar"};
		
		Stream<String> namestream=Stream.of(names);
		
		namestream.forEach(n->{
			System.out.println(n);
		});
	}
	
}
