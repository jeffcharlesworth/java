package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(1234);
        reverse(1234);
    }
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int workingNum = number;
        while (workingNum > 0) {
            int remainder = workingNum % 10;
            workingNum = workingNum / 10;
            switch (remainder) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 0:
                    System.out.println("Zero");
                    break;
            }
        }
    }
    public static int reverse(int number) {
        int reversed = 0;
        int count = 1;
        while (number > 0) {
            int holdNum = number % 10;
            reversed += (holdNum * count);
            number /= 10;
            count *= 10;
        }
        System.out.println(reversed);
        return reversed;
    }
}
