package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        int finishNumber = 20;
        int count = 0;


        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber((number))) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if (count >= 5) { break; }
        }
        System.out.println("Total: " + count);
    }
    public static boolean isEvenNumber (int num) {
        boolean even = (num % 2 == 0) ? true : false;
        return even;
    }}
