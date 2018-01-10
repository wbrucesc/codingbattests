package com.will;

public class Ex5 {

//  Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            return sum * 2;
        } else {
            return sum;
        }
    }

}
