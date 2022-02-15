package com.josh.Optional;

import java.util.Optional;

public class OptionalDemo {
	
	
	public static Optional<String> getName()
	{
		String name=null;
		return Optional.ofNullable(name);
	}
	
	
	
	public static void main(String[] args)
	{
		String str=null;
		
		Optional<String> optional=Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		
		//System.out.println(optional.get());
		
		//System.out.println(optional.orElse("No Value Present"));
		
		Optional<String> name=getName();
		
		System.out.println(name.orElse("no name present"));
	}
}
