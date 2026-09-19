package com.lessons.day4;

public class DemoHNestedForLoops {
	
	public static void m0() 
	{
		for(int i=1;i<10;i++)
		{
			System.out.print("i="+i+"=> ");
			for(int k=1;k<=10;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void m1() 
	{
		for(int i=1;i<10;i++)
		{
			System.out.print("i="+i+"=> ");
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	public static void m2() 
	{
		for(int i=1;i<10;i++)
		{
			for(int j=9;j>i;j--)
			{
				System.out.print(". ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	public static void m3() 
	{
		for(int i=1;i<10;i++)
		{
			for(int j=9;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			for(int n=2;n<=i;n++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}

	public static void m4() 
	{		
		for(int i=8;i>0;i--)
		{
			for(int j=8;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			for(int n=2;n<=i;n++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
	public static void m5()
	{
		m3();
		m4();
	}
//	public static void testDemoH() 
	public static void main(String args[])
	{
		m5();
	}
}
