package com.josh.Polymorphism;

public class Calculator {
	
	public int add(int x,int y)
	{
		return x+y;
	}
	
	public float add(float a,float b)
	{
		return a+b;
	}
	
	public double add(double a,double b,double c)
	{
		return a+b+c;
	}
	
	public double divide(double a,double b)
	{
		return a/b;
	}
}

class MathsUtility extends Calculator
{
	public double divide(double a,double b)
	{
		if(b!=0)
			return a/b;
		
		return 0;
	}
}
