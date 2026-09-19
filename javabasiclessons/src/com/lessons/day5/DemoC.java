package com.lessons.day4;

public class DemoC {
	//Global
	public static int r1=1111; // static field
	public int x=12345; // non static field
	
	public static void m1() 
	{
		// accessing static field inside a static method
		System.out.println("r1="+ r1); 
		// can not access a non static field inside a static method
		// System.out.println("x="+ x);
	}
	
	public static void m2() 
	{
		System.out.println("M2 "+r1);
		// To access a non static field inside a static method
		// An Object of the class has to be created
		DemoC d1=new DemoC();
		System.out.println("x="+ d1.x);
	}
	public void m3()
	{
		// accessing static field inside a non static method
		System.out.println("r1="+r1);
		// accessing non static field inside a non static method 
		// within the same class
		System.out.println("x="+x);
		// For accessing non static field inside a non static method 
		// from another class check ==> DemoCTestNonStatic.java
	}
}
