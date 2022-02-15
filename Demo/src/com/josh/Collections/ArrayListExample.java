package com.josh.Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	public static boolean isPrime(int n)
	{
		int sq=(int)Math.sqrt(n);
		for(int i=2;i<=sq;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		List<Integer> l= new ArrayList<>();
		
		for(int i=2;i<=100;i++)
		{
			if(isPrime(i))
				l.add(i);
		}
//		
//		Iterator<Integer> itr=l.iterator();
//		
//		System.out.println("printing prime no from 2 to 100");
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		l.forEach((n)->{int val=2*n;System.out.println(val);});
		
	}
}
