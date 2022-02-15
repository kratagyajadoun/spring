package com.josh.Abstraction;

interface Vehicle
{
	int noOfWheels();
	
	int getMileage();
}

abstract class Auto implements Vehicle
{
	public int noOfWheels()
	{
		return 3;
	}
}

class Car implements Vehicle
{
	public int noOfWheels()
	{
		return 4;
	}
	
	public int getMileage()
	{
		return 25;
	}
}
