package com.lessons.day3.primitivetypes;
public class DemoC
{
	/** class variable */
	static int gx=67765656;
	static int gy;
	/** instance variable - requires an Object to access them */
	int data1;
	int data2;
	public void doSomeTask()
	{
		/** Accessing static global variable - Class Variables */
		System.out.println( "gx=" + DemoC.gx);		
		/** Accessing instance global variable from a non static method */
		System.out.println( "data1=" + data1);
		System.out.println( "data2=" + data2);
		
		/** Can not access a local variable declared in m2() */
		// x=2000;
		// System.out.println("Value of x="+x);
	}
	public void doNothing()
	{
		int x=1000;
	}
}