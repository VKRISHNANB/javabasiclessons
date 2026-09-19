package com.lessons.day3and4.primitivetypes;

public class NonStaticMembersIllustrator {
	int x = 100;
	int y = 200;

	public static void main(String[] args) {
		int a1 = 2344;
		int a2 = a1;
		NonStaticMembersIllustrator b1 = null;
		b1 = new NonStaticMembersIllustrator();
		NonStaticMembersIllustrator b2 = b1;
		b1.firstMethod();
		b1 = null;
	}

	public void firstMethod() {
		System.out.println("firstMethod");
		int v1 = 500;
		int v2 = 600;
		System.out.println("v1=" + v1 + " v2=" + v2);
		Object obj1 = new Object();
	}
}
