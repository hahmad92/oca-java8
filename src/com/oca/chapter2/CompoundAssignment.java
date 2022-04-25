package com.oca.chapter2;

public class CompoundAssignment {

	public static void main(String[] args) {
		int x = 2, z = 3;
		x = x * z; // Simple assignment operator
		x *= z; // Compound assignment operator

		// int d +=1; //compile time error
		int c;
		// c += 9; //compile time error


		long x3 = 10;
		int y3 = 5;
		//y3 = y3 * x3; // DOES NOT COMPILE
		y3 *= x3;

		long x1 = 5;
		long y = x1 += 3;
		System.out.println(x1); // Outputs 3
		System.out.println(y); // Also, outputs 3
	}

}
