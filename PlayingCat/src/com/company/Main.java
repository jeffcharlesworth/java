package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean isCatPlaying (boolean summer, int temperature) {
        int lowerTemp = 25;
        int upperTemp = 35;
        if (summer) {
            upperTemp = 45;
        }
        if (temperature >= lowerTemp && temperature <= upperTemp) {
            return true;
        } else {
            return false;
        }
    }
}
