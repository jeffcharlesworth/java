package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        boolean result = (sum == number) ? true : false;
        return result;
    }
}
