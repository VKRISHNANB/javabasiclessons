package com.lessons.day3.primitivetypes;

public class DemoB {
	int x=100;   
    int y=200;
    public static void main(String[] args)  {
        int a1=2344;   
        int a2=a1;
        DemoB b1=null;
        b1= new DemoB();
        DemoB b2=b1;
        b1.m1();
        b1=null;
     }
     public void m1()  {
        int v1=500;
        int v2=600;
        Object obj1=new Object();
    }
}
