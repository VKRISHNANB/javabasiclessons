package com.lessons.day3and4.primitivetypes;

public class LocalPrimitiveVariablesIllustrator {
	public static void main(String[] args) {
		int x = 100;
		int y = x;
		System.out.println(x + " " + y);
		x = 123;
		System.out.println(x + " " + y);
		// x=null;
	}
}
