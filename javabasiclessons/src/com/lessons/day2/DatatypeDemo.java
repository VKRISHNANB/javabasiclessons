package com.lessons.day2;

public class DatatypeDemo {

	public static void main(String[] args) {
		int valueforx=100;
		int valuefory=200;
		int resultfromadd=add(valueforx,valuefory);
		System.out.println("Result "+resultfromadd);
	}
	public static void methodA()
	{
      int x=5;
      System.out.println(x);
      x=3;
      System.out.println(x);
      x+=10;
      System.out.println(x);
	}
	public static void methodB()
	{
	  int x=10; 
	  int y=20; 
	  System.out.println (x+y);// 30
	  String s1="10";
	  String s2="20"; 
	  System.out.println(s1+s2); // 1020
	  String s3="Hello " ; 
	  String s4=" Have a Nice Day";
	  System.out.println(s3+s4);
	}
	public static void foo (int i, float f) 
	{ 
		System.out.println("i="+i+" f="+f);
	} 

	public static void bar () 
	{ 
	   int anInt = 1; 
	   foo (anInt, 2.0f); 
	} 
	public static int add(int x,int y) 
	{
		int result = x+y;
		return result;
	}
}
