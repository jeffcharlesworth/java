package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void printEqual (int one, int two, int three) {
        int[] intArray = {one, two, three};
        for (int num : intArray) {
            if (num < 0) {
                System.out.println("Invalid Value");
                return;
            }
        }
        if (one == two && two == three) {
            System.out.println("All numbers are equal");
            return;
        } else if (one != two && two != three && three != one) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
