package com.company;

public class Main {

    public static void main(String[] args) {
        sumOdd(4, 78);
    }
    public static boolean isOdd (int num) {
        if (num < 0) {return false;}
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumOdd (int start, int end) {
        int sum = 0;
        if (start > end || start < 0 || end < 0) { return -1; }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {sum += i;}
        }
        System.out.println(sum);
        return sum;
    }
}
