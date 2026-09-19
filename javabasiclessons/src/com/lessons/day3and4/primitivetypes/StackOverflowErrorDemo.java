package com.lessons.day3.primitivetypes;

public class StackOverflowErrorDemo {

	public static void main(String[] args) {
		m1();
	}
    public static void m1()
    {
    	double d1=999999999999999d;
    	m2();
    }
    public static void m2()
    {
    	double d2=999999999999999d;
    	m1();
    }

}
