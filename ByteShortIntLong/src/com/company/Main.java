package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; // Integer - Wrapper class
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1)); // numeric overflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1)); // numeric underflow

//        int myMaxIntTest = 2147483648; Integer number too large
        int myMaxIntTest = 2_147_483_647;
    }
}
