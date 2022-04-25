package com.oca.chapter2;

public class ForLoop {

	public static void main(String[] args) {

		//simple loop
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " ");
		}
		//without initialization statement
		int i = 100;
		for(; i < 110; i++) {
			System.out.println(i + " ");
		}

		//without update statement.
		i = 300;
		for(; i < 310; ) {
			System.out.println(i + " ");
			i++;
		}

		//infinite loop
		for( ; ; ) {
			System.out.println("Hello World");
		}

		int x = 0;

		for(long y = 0, z = 4; x < 5 && y < 10; x=x+1, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x);

	}

}
