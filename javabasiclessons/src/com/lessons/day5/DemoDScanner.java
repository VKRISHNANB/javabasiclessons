package com.lessons.day5;

import java.util.Scanner;

public class DemoDScanner {
	public static void firstMethod() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String strName = s1.nextLine();
		System.out.println("Welcome to Java " + strName);
		s1.close();
	}

	public static void secondMethod() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a value for X:");
		String strx = s1.nextLine();
		System.out.println("Enter a value for Y:");
		String stry = s1.nextLine();
		int x = Integer.parseInt(strx);
		int y = Integer.parseInt(stry);
		System.out.println("X is " + x);
		System.out.println("Y is " + y);
		s1.close();
	}

	public static void thirdMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No");
		String s1 = sc.nextLine();
		char[] data = s1.toCharArray();
		for (int i = 0; i < data.length; i++) {
			System.out.println(" : " + data[i]);
		}
		sc.close();
	}

	public static void fourthMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No");
		String s1 = sc.nextLine();
		char[] data = s1.toCharArray();
		int ascii_no = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println(" : " + data[i]);
			ascii_no = data[i];
			if (ascii_no < 47 || ascii_no > 58)
				System.out.println("Char not a No " + ascii_no);
		}
		sc.close();
	}

	public static void main(String args[]) {
		// firstMethod();
		thirdMethod();
	}
}
