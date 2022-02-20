package com.lessons.day4;
public class DemoA
{// beginning of a class
	public static void main(String args[]) 
	{
		add(100,20);
		multiply(100,5);
		divide(36,3);
	}	
	public static void add(int x,int y) 
	{
		int v1=100;
		System.out.println("result="+(x+y));
	}
	public static void multiply(int x,int y) 
	{
		System.out.println("result="+(x*y));
	}
	public static void divide(int x,int y) 
	{
		System.out.println("result="+(x/y));
	}	
}//end of a class