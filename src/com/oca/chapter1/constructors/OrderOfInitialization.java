package com.oca.chapter1.constructors;

public class OrderOfInitialization {
	static int i;
	{
		System.out.println("First Initialization Block");
	}
	private String name = "Aloha";
	{
		System.out.println("Second Block");
		System.out.println("Name: " + name);

		//Can not be accessed before declaration in initialization block
		//System.out.println("Last Name: " + lastName); //Compiler Error
	}

	public OrderOfInitialization() {
		System.out.println("OrderOfInitialization constructor");
		System.out.println(i);
		name = "Hammad";
		lastName = "Ahmad";
		System.out.println("Name: " + name);
		System.out.println("Last Name: " + lastName);
	}
	
	private String lastName = "Mora";
	{
		System.out.println("Third Block");
		System.out.println("Last Name: " + lastName);
	}

	public static void main(String[] args) {
		OrderOfInitialization chick = new OrderOfInitialization();
		System.out.println(chick.name);
	}
}
