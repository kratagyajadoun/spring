package com.josh.Inheritance;

 class Thread1 extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println("Inside thread child class");
	}
}

 