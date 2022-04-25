package com.oca.chapter2;

public class DoWhileStatement {

	public static void main(String[] args) {

	}

	public static void constantVariableInLoop() {
		System.out.println("Start of method : constantVariableInLoop");
		final int i = 0;
		do {
			System.out.println(i);
		} while (i < 10);
		System.out.println("End of method : constantVariableInLoop");
	}

	public static void constantVariableInLoop1() {
		System.out.println("Start of method : constantVariableInLoop1");
		final int i = 0;
		do{
			if (2 == 3)
				return;
			System.out.println(i);
		}while (i < 10);
		System.out.println("End of method : constantVariableInLoop1");
	}

	public static void constantVariableInLoop2() {
		System.out.println("Start of method : constantVariableInLoop2");
		final int i = 0;
		do {
			if (2 == 3) {
				break;
			}
			System.out.println(i);

		}while (i < 10);
		System.out.println("End of method : constantVariableInLoop2");
	}

	//
	public static void falseInWhile() {
		System.out.println("Start of method : falseInWhile");
		do{
			System.out.println("1");
		}while (false);
		System.out.println("End of method : falseInWhile");
	}

	public static void trueInWhileWithoutBreak() {
		System.out.println("Start of method : trueInWhile");
		do{
			System.out.println("1");
		}while (true);
		System.out.println("End of method : trueInWhile");
	}

	public static void trueInWhileWitBreak() {
		System.out.println("Start of method : trueInWhile");
		do{
			System.out.println("1");
			break;
		}while (true);
		System.out.println("End of method : trueInWhile");
	}

}
