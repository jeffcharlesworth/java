package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(9, 18));
    }
    public static int getGreatestCommonDivisor (int first, int second) {
        int lowestNum = Math.min(first, second);
        for (int i = lowestNum; i > 0; i--) {
            if (first < 10 || second < 10) {return -1;}
            if (first % i == 0 && second % i == 0) {return i;}
        }
        return -1;
    }
}
