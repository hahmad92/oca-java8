package com.oca.chapter4.overloadingmethods;

public class Primitives {
    public void fly(int i) {
        System.out.print("int ");
    }
    public void fly(long l) {
        System.out.print("long ");
    }
    public static void main(String[] args) {
        Primitives p = new Primitives();
        p.fly(123);
        p.fly(123L);
    }
}
