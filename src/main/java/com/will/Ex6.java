package com.will;

public class Ex6 {

//    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    public static boolean makes10(int a, int b) {
        int sum = a + b;
        if ((a == 10) || (b == 10)) {
            return true;
        } else if (sum == 10) {
            return true;
        } else {
            return false;
        }
    }
}
