package com.lessons.day4;

import java.util.Scanner;

public class DemoIF {
	public static void testIf() {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No");
		int x=sc.nextInt();	// returns an int 	
		if(x<100) 
			System.out.println("The Value is < 100");
		else if(x>=100 && x<500)
			System.out.println("The Value is < 500");
		else 
			System.out.println("The Value is >= to 500");		
		sc.close();
	}
//	Income up to Rs 2,50,000*	No tax
//	Income from Rs 2,50,000 – Rs 5,00,000	5%
//	Income from Rs 5,00,000 – 10,00,000	20%
//	Income more than Rs 10,00,000	30%	
	public static void taxcalulationA()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter your Salary");
		int salary=sc.nextInt();
		sc.close();
		float tax=-1;
		
		if(salary<250000) 
			tax=0;
		else if(salary>=250000 && salary<500000)
			tax=(salary-250000)*0.05f;			
		else if(salary>=500000 && salary<1000000)
		{
			tax=(250000*.05f);
			tax+=(salary-500000)*0.2f;
		}
		else
		{
			tax=(250000*.05f)+(500000*0.2f);
			tax+=(salary-1000000)*0.3f;
		}
		System.out.print("For Salary of Rs"+salary);
		System.out.println(" Your Tax amount is "+tax);
	}
	
	public static void taxcalulationB()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter your Salary");
		int salary=sc.nextInt();
		sc.close();
		int slab1=250000; int slab2=500000; int slab3=1000000;
		float slabrate1=0.05f; float slabrate2=0.2f; float slabrate3=0.3f;
		float tax=-1;
		if(salary<slab1) 
			tax=0;
		else if(salary>=slab1 && salary<slab2)
			tax=(salary-slab1)*slabrate1;			
		else if(salary>=slab2 && salary<slab3)
		{
			tax=(slab1*slabrate1);
			tax+=(salary-slab2)*slabrate2;
		}
		else
		{
			tax=(slab1*slabrate1)+(slab2*slabrate2);
			tax+=(salary-slab3)*slabrate3;
		}
		System.out.print("For Salary of Rs"+salary);
		System.out.println(" Your Tax amount is "+tax);
	}

}
