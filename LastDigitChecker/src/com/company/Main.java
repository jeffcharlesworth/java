package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10, 45, 500));
    }
    public static boolean hasSameLastDigit (int first, int second, int third) {
        int[] numbers = {first, second, third};
        int[] lastNum = new int[3];
        for (int n : numbers) {
            if (!isValid(n)) {
                return false;
            } else {
                System.out.println(n);
                Arrays.(lastNum, n);
            }
        }
        System.out.println(Arrays.toString(lastNum));

        return true;
    }
    public static boolean isValid(int num) {
        return !(num < 10 || num > 1000);
    }
}
