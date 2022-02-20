package com.lessons.day4;

public class DemoCTestNonStatic {
	public static void main(String args[]) 
	{
		test1();
		test2();
	}
	public static void test1()
	{
		// accessing static field inside a non static method
		System.out.println("r1="+DemoC.r1);
		// accessing static field inside a non static method
		DemoC d1=new DemoC();
		System.out.println("x="+d1.x);
	}
	public static void test2() 
	{
		System.out.println("testDemoC "+DemoC.r1);
		// method call
		DemoC.m2();
		DemoC.m1();
		DemoC d1=new DemoC();
		d1.m3();
	}
}
