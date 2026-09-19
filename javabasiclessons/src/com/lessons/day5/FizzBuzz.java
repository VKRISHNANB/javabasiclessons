package com.lessons.day4;
/**  
 * @author venkatakrishnanb
 *  
 * Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number
 * and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz”."
 */
public class FizzBuzz {
	public static void main(String[] args) 
	{
	}
	public static void testA() {
		//
		int theNumber=0;
		if (theNumber/3== 0) 
		{
			if (theNumber/5==0) System.out.print( "FizzBuzz");
			else System.out.print("Fizz");
		}
		else if (theNumber /5==0) System.out.print("Buzz");
		else /* theNumber is not divisible by 3 or 5 */
			System.out.print(theNumber);
	  //
	  //
	  if ((theNumber/3==0) && (theNumber /5==0))
		  System.out.print( "FizzBuzz");
	  else if (theNumber/3==0) 
		  System.out.print("Fizz");
	  else if (theNumber/5==0) 
		  System.out.print( "Buzz");
	  else /* theNumber is not divisible by 3 or 5 */
		  System.out.print( theNumber);
	  //
	  //
	  boolean flag = true;
		for(int i=0;i<16;i++)
		{
			if(i%3==0){
				System.out.print("Fizz");
				flag=false;
			}

			if(i%5==0){
				System.out.print("Buzz");
				flag=false;
			}

			if (flag)
				System.out.print(i);
			System.out.print(",");
			flag = true;
		}
	  //
	}
	public static void testB(){		
		for(int i = 1; i <= 100; i++){
			String test = "";
			test += (i % 3) == 0 ? "fizz" : "";
			test += (i % 5) == 0 ? "buzz" : "";
			System.out.println(!test.isEmpty() ? test : i);
		}
	}
	public static void testC()
	{		
		for(int i = 0; i < 100; i++, System.out.println(i % 3 == 0 || i % 5 == 0 ? ((i % 3) == 0 ? "fizz" : "") + ((i % 5) == 0 ? "buzz" : "")  : i));
	}
	public static void testD()	
	{
		String buzz =  "buzz", fizz = "fizz"; 
		for (int i = 1; i <= 100; i++)
		{
			if (i % 15 == 0) //check if number in position i is divisable by 15, if so don't check other 2 conditions - we don't want a double print
			{
			  System.out.println(buzz + fizz + " " + i);
			}
			else if (i % 3  == 0 )
			{
			  System.out.println(buzz + " " + i);
			}
			else if (i % 5== 0)
			{
			  System.out.println(fizz + " "+ i);
			}
		}
	}
}
