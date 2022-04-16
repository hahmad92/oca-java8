//do good
package com.oca.chapter1.primitives.types;

public class PrimitiveTypes {

	//The value of litrel is greater than an integer can store that is why compilation erorr.

	//long max = 3123456789; // DOES NOT COMPILE
	long small = 123; // DOES NOT COMPILE

	//double notAtStart = _1000.00; // DOES NOT COMPILE
	//double notAtEnd = 1000.00_; // DOES NOT COMPILE
	//double notByDecimal = 1000_.00; // DOES NOT COMPILE
	double annoyingButLegal = 1_00_0.0_0; // this one compiles

	public static void main(String[] args) {
		System.out.println(56); // 56
		System.out.println(0b11); // 3
		System.out.println(017); // 15
		System.out.println(0x1F); // 31
	}

}
