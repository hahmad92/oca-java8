package com.oca.chapter4.staticimports;

public class ClassA {
	public static String NAME = "MIKE";
	
	public static void printName() {
		System.out.println("Class A: name->" + NAME);
	}
	
	public static void printFoo(int a) {
		System.out.println("Class B: name->" + NAME);
	}
}
