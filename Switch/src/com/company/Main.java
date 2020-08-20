package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("everything is a lie");
//        }

//        int switchValue = 3;
//
////        switch (switchValue) {
////            case 1:
////                System.out.println("Value was 1");
////                break;
////            case 2:
////                System.out.println("Value was 2");
////                break;
////            case 3: case 4: case 5:
////                System.out.println("was a 3, 4, 5");
////                System.out.println("Actually is was a " + switchValue);
////                break;
////            default:
////                System.out.println("Was not 1 or 2");
////                break;
////        }
        char option;
        option = 'G';
        switch (option) {
            case 'A':
                System.out.println("Found A");
                break;
            case 'B':
                System.out.println("Found B");
                break;
            case 'C':
                System.out.println("Found C");
                break;
            case 'D':
                System.out.println("Found D");
                break;
            case 'E':
                System.out.println("Found E");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
