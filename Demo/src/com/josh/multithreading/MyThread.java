package com.josh.multithreading;

 class MyThread1 extends Thread {
	
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("thread 1");
		
	}
}

 class MyThread2 extends Thread {
	
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("thread 2");
	}
}

 public class MyThread 
 
 {
	 public static void main(String[] args)
	 {
		 MyThread1 t1= new MyThread1();
		 t1.setPriority(3);
		 
		  
		 MyThread2 t2= new MyThread2();
		 t2.setPriority(6);
		 
		 t1.start();
		 t2.start();
		 for(int i=0;i<5;i++)
			 System.out.println("Main thread");
		
	 }
 }