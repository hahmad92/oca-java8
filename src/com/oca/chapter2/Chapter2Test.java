package com.oca.chapter2;

public class Chapter2Test {

	public static int hourOfDay = 10;
	public static void main(String[] args) {
		int x = 5;
		int y = x++ + --x;
		System.out.println("value of x is: " + y);
		if (hourOfDay < 15) {
			System.out.println("Good Afternoon");
		} else if (hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
		} else {
			System.out.println("Good Evening");
		}
		System.out.println(-10/-3);
	}

	public static void addSmallTypes() {
		short s = 10;
		byte b = 10;
		
		//s = s + b;
		
	}
}
