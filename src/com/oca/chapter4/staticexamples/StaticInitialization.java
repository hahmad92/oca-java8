package com.oca.chapter4.staticexamples;

public class StaticInitialization {
    private static final int NUM_SECONDS_PER_HOUR;
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
        System.out.println(NUM_SECONDS_PER_HOUR);
    }

    public static void main(String args[]) {
        System.out.println("I am first");
    }
}
