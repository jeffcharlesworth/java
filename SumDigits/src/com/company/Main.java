package com.company;

public class Main {

    public static void main(String[] args) {
     //   sumDigits(128128);
        isPalindrome(100001);
    }
    public static int sumDigits(int number){
        int base = 10;
        int sum = number % 10;
        int length = String.valueOf(number).length();
        if (number >= 10) {
            for (int i = 0; i <= length; i++  ) {
                sum = sum + ((number / base) % 10);
                base *= 10;
            }
            System.out.println(sum);
            return sum;
        } else {
            return -1;
        }
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int baseNum = number;

        while (Math.abs(number) > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;

        }

        if (reverse == baseNum) {
            return true;
        }
        return false;
    }
}
