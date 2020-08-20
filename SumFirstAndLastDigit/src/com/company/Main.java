package com.company;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(-309);
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {return -1;}
        int length = String.valueOf(number).length();
        int count = 0;
        int sum = 0;
        do {
            if (count == 0 || count == length - 1) {
                int remainder = number % 10;
                sum += remainder;
                if (length == 1) {
                    sum += remainder;
                }
            }
            count++;
            number /= 10;
        } while (count <= length);
        return sum;
    }
}
