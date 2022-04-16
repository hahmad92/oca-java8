package com.oca.chapter1.reference.types;

public class ReferenceTypes {


    public static void main(String[] args) {
        java.util.Date today;
        String greeting;

        String reference = "hello";
        int len = reference.length();

        reference = null;
        //len = null; // DOES NOT COMPILE
        //int bad = len.length(); // DOES NOT COMPILE

        //String s1, s2;
        String s3 = "yes", s4 = "no";

        boolean b1, b2;
        String s1 = "1", s2;
        //double d1, double d2; error
        int i1; int i2;
        //int i3; i4; error because of i4
    }
}
