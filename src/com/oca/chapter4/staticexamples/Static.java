package com.oca.chapter4.staticexamples;

public class Static {
    private String name = "Static class";
    public static void first() {
        System.out.println("first");
    }
    public static void second() {
        System.out.println("second");
    }
    public void third() {
        System.out.println(name);
    }

    public static void main(String args[]) {
        first();
        second();
        third(); // DOES NOT COMPILE
    } }
