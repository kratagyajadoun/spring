package com.josh.String;

public class StringExample {

	public static void main(String[] args)
	{
		String s="Welcome to Josh Software";
		int n=s.length();
		System.out.println(n);
		
		String lowercase_string=s.toLowerCase();
		System.out.println(lowercase_string);
		
		String uppercase_string=s.toUpperCase();
		System.out.println(uppercase_string);
		
		System.out.println("printing characters with spacing");
		for(int i=0;i<n;i++)
			System.out.print(s.charAt(i)+" ");
		System.out.println();
		
		String str="welcome to josh digital";
		System.out.println(s.equals(str));
		
		String substr=s.substring(11);
		System.out.println(substr);
		
	}	
}
