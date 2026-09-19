package com.lessons.day1;

// beginning of class
public class Example {
	int x = 100; // global variable
	int y = 200; // global variable

	public static void main(String[] args) {
		int amount = 2000; // local variable
		System.out.println("Welcome to Java !!! " + amount);
	}
} // end of class

//Variable declaration before class definition - Illegal
//int x=100; 
class ExampleTwo {
	int x = 100; // global variable
	int y = 200; // global variable
	// beginning of method

	public static void main(String[] args) {
		int amount = 2000; // local variable
		System.out.println("Welcome to Java !!!");
	} // end of method
		// Statements out side the method - illegal
		// System.out.println("Hello there !!!");
}
//Variable declaration after class definition - Illegal
//int y=200; 
//Statements out side the method - illegal
//System.out.println("Hello there !!!");
