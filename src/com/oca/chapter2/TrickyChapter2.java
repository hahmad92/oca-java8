package com.oca.chapter2;

public class TrickyChapter2 {
    public static void main(String[] args) {
        evaluation();

    }

    static void evaluation(){
        System.out.println("Method evaluation start: ");
        int x = 5;
        int y = x++ + --x;
        System.out.println("value of x is: " + y);
    }
}
