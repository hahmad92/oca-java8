package com.oca.chapter4.staticexamples;

public class StaticInitializationProblems {
    private static int one;
    private static final int two;
    private static final int three = 3;
    private static final int four; // DOES NOT COMPILE because it never gets initialized

    static {
        one = 1;
        two = 2;
        three = 3; // DOES NOT COMPILE because it is already initialized
        two = 4; // DOES NOT COMPILE because it is already initialized
    }

    public static void main(String args[]) {
        System.out.println("I am first");
    }
}
