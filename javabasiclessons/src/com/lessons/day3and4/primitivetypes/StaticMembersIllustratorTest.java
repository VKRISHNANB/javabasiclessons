package com.lessons.day3.primitivetypes;

public class DemoCTest {
	/** using Class Variables */
	public static void testStaticVariables() 
	{
		/**
		 * using Instance variables : A static method can not access
		 * the instance variable of a class 
		 * with out creating an object
		*/
		// data1=12345;
		
		DemoC a1 = new DemoC(); //Object creation
		a1.data1 = 12345;
		a1.data2 = 67890;
		System.out.println("Data1=" + a1.data1);
		System.out.println("Data2=" + a1.data2);

		System.out.println( "Inside m0-gx=" + DemoC.gx);// 67765656
//		DemoC.gx=200;
		/**		Calling another static method m1() from m0() */ 
//		m1();
		/**	checking the value of gx after calling m1() */
//		System.out.println("Inside m1-gx=" + DemoC.gx);//50000
}
	// To be called from m0
	private static void m1()  
	{
		System.out.println("Inside m1-gx="+DemoC.gx);//200
		DemoC.gx=50000;
		System.out.println("Inside m1-gx="+DemoC.gx);//50000
	}
	
	public static void main(String[] args) {
		testStaticVariables();
//		DemoC d1 = new DemoC();
//		d1.doSomeTask();
	}
}
