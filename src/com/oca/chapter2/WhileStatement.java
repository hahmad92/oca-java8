package com.oca.chapter2;

public class WhileStatement {

	public static void main(String[] args) {
		constantVariableInLoop2();
		
		while(1 > 10) {
			System.out.println("asd");
		}
	}

	public static void constantVariableInLoop() {
		System.out.println("Start of method : constantVariableInLoop");
		final int i = 0;
		while (i < 10) {
			System.out.println(i);
		}
		System.out.println("End of method : constentVariableInLoop");
	}

	public static void constantVariableInLoop1() {
		System.out.println("Start of method : constantVariableInLoop1");
		final int i = 0;
		while (i < 10) {
			if (2 == 3)
				return;
			System.out.println(i);
		}
		System.out.println("End of method : constentVariableInLoop1");
	}

	public static void constantVariableInLoop2() {
		System.out.println("Start of method : constantVariableInLoop2");
		final int i = 0;
		while (i < 10) {
			if (2 == 3) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("End of method : constantVariableInLoop2");
	}
	public static void falseInWhile() {
		System.out.println("Start of method : falseInWhile");
		while (false) {
			System.out.println("1");
		}
		System.out.println("End of method : falseInWhile");
	}

	public static void trueInWhileWithoutBreak() {
		System.out.println("Start of method : trueInWhile");
		while (true) {
			System.out.println("1");
		}
		System.out.println("End of method : trueInWhile");
	}
	public static void trueInWhileWitBreak() {
		System.out.println("Start of method : trueInWhile");
		while (true) {
			System.out.println("1");
			break;
		}
		System.out.println("End of method : trueInWhile");
	}
}
