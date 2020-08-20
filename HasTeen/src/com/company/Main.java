package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        hasTeen(23, 34, 13);
    }
    public static boolean hasTeen(int first, int second, int third) {
        int[] ages = {first, second, third};
        boolean teenInArray = false;
        for(int i = 0; i < ages.length; ++i ) {
            if (isTeen(ages[i])) {
                return true;
            }
        }
        return false;
    }
    public static boolean isTeen(int age) {
        int[] teens = { 13,14,15,16,17,18,19 };
        int ageInTeens = Arrays.binarySearch(teens, age);
        System.out.println(ageInTeens);
        boolean hasTeen = ageInTeens > -1 ? true : false;
        return hasTeen;
    }
}
