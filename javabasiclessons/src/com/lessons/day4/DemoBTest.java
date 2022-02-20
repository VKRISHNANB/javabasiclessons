package com.lessons.day4;


public class DemoBTest {
    public static void main(String[] args) {
        DemoB.m1();
		// DemoB.m2(); ==> non static method, Requires an object reference
		DemoB d1=new DemoB();
        d1.m2();
        DemoB.m3();
    }
}