package com.lessons.day3and4.primitivetypes;

// Parsing String value to int value
public class StringParsingIllustrator {
	public static void main(String[] args) {
		String firstString = "12345";
		String secondString = "500";
		System.out.println("firstString=" + firstString + " secondString=" + secondString);
		System.out.println(firstString + secondString);
		/** String to int */
		int firstNumber = Integer.parseInt(firstString);
		/** String to int */
		int secondNumber = Integer.parseInt(secondString);
		System.out.println("firstNumber=" + firstNumber + "   secondNumber=" + secondNumber);
		System.out.println(firstNumber + secondNumber);
	}
}
