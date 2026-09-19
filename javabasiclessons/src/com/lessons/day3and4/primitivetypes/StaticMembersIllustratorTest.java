package com.lessons.day3and4.primitivetypes;

public class StaticMembersIllustratorTest {
	/** using Class Variables */
	public static void testStaticVariables() {
		/**
		 * using Instance variables : A static method can not access the instance
		 * variable of a class with out creating an object
		 */
		// data1=12345;

		StaticMembersIllustrator a1 = new StaticMembersIllustrator(); // Object creation
		a1.data1 = 12345;
		a1.data2 = 67890;
		System.out.println("Data1=" + a1.data1);
		System.out.println("Data2=" + a1.data2);

		System.out.println("Inside m0-gx=" + StaticMembersIllustrator.gx);// 67765656
		StaticMembersIllustrator.gx = 200;
		/**
		 * Calling another static method changeStaticFieldValue() from
		 * testStaticVariables()
		 */
		changeStaticFieldValue();
		/** checking the value of gx after calling changeStaticFieldValue() */
		System.out.println("Inside m1-gx=" + StaticMembersIllustrator.gx);// 50000
	}

	// To be called from testStaticVariables
	private static void changeStaticFieldValue() {
		System.out.println("Inside m1-gx=" + StaticMembersIllustrator.gx);// 200
		StaticMembersIllustrator.gx = 50000;
		System.out.println("Inside m1-gx=" + StaticMembersIllustrator.gx);// 50000
	}

	public static void main(String[] args) {
		testStaticVariables();
//		DemoC d1 = new DemoC();
//		d1.doSomeTask();
	}
}
