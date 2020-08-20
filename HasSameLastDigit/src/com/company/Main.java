package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        hasSameLastDigit(21, 32, 44);
    }
    public static boolean hasSameLastDigit (int first, int second, int third) {
        int[] nums = {first, second, third};
        for (int num : nums) {
            if (isValid(num)) { return false; }
        }
        if (first % 10 == second % 10 || first % 10 == third % 10 || second % 10 == third % 10) { return true;}
        return false;
    }
    public static boolean isValid (int num) {
        if (num < 10 || num > 1000) {
            return true;
        }
        return false;
    }
}
