package com.oca.chapter4.overloadingmethods;

public class MethodOverloadingExamples {
    public void fly(int numMiles) {

    }
    public void fly(short numFeet) {

    }
    public boolean fly() {
        return false;
    }
    void fly(int numMiles, short numFeet) {

    }
    public void fly(short numFeet, int numMiles) throws Exception {

    }

    //Returen types does not matter
    public void fly(int numMiles) {

    }
    public int fly(int numMiles) {
        return  1;
    }

    //Optional Spacifiers also does not
    public void fly(int numMiles)

    public static void fly(int numMiles) {
        return;
    }
}
