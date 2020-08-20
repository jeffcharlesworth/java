package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000.00, 2.0));
//
//        for(int i = 0; i < 5; i++) {
//            System.out.println("Loop " + i + " hello!");
//        }
//
//        for(int i = 2; i < 9; i++) {
//            System.out.println(String.format("%.2f", calculateInterest(10_000, i)));
//        }
//        System.out.println("********************");
//
//        for(int i = 8; i > 1; i--) {
//            System.out.println(String.format("%.2f", calculateInterest(10_000, i)));
//        }
//        System.out.println("********************");
        int counter = 0;
        long upperLimit = 1_000_000_000;
        long maxResults = 1_000_000;
        for(int i = 2; i < upperLimit && counter < maxResults; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                counter++;
            }
        }
        System.out.println(counter + " prime numbers found");
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }
}
