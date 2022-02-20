package com.lessons.day4;

import java.util.Scanner;

public class DemoD 
{
	public static void m1() 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String strName=s1.nextLine();
		System.out.println("Welcome to Java "+strName);
		s1.close();
	}
	
	public static void m2() 
	{
		String s1="123";
		String s2="345";
		String s3=s1+s2;//123345
		System.out.println("Result is "+s3);
		int x=Integer.parseInt(s1);//Converts string to int
		int y=Integer.parseInt(s2);
		int z=x+y;
		System.out.println("Result is "+z);
	}
	public static void m3()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a value for X:");
		String strx=s1.nextLine();
		System.out.println("Enter a value for Y:");
		String stry=s1.nextLine();
		int x=Integer.parseInt(strx);
		int y=Integer.parseInt(stry);
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
		s1.close();
	}
	public static void m4() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No");
		String s1=sc.nextLine();
		char[] data=s1.toCharArray();		
		for(int i=0;i<data.length;i++)
		{
			System.out.println(" : "+data[i]);
		}		
		sc.close();
	}
	public static void m5() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No");
		String s1=sc.nextLine();
		char[] data=s1.toCharArray();	
		int ascii_no=0;
		for(int i=0;i<data.length;i++)
		{
			System.out.println(" : "+data[i]);
			ascii_no=data[i];
			if(ascii_no<47 || ascii_no> 58) 
				System.out.println("Char not a No "+  ascii_no);
		}		
		sc.close();
	}
	public static void main(String args[]) 
	{
		//m1();
		m3();
	}
}
