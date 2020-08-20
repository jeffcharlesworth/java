package com.company;

public class Main {

    public static boolean areEqualByThreeDecimalPlaces(double firstDouble, double secondDouble) {

        firstDouble = Math.round((long)(firstDouble * 1000.0)) / 1000.0;
        secondDouble = ((long)(secondDouble * 1000.0)) / 1000.0;
//        System.out.println(firstDouble);
//        System.out.println(secondDouble);

        if (firstDouble == secondDouble) {
            //System.out.println("equal " + firstDouble + " " + secondDouble );
            return true;
        }
        //System.out.println("not equal " + firstDouble + " " + secondDouble );
        return false;
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPoints(3.1756, 3.175);
    }
}
