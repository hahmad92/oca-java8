package com.oca.chapter1.variables;

public class DefaultInitialization {

    public static void main(String[] args) {

    }

    public int notValid() {
        int y = 10;
        int x;
        int reply = 0;
        //int reply = x + y; // DOES NOT COMPILE
        return reply;
    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }
}
