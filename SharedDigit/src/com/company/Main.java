package com.company;

public class Main {

    public static void main(String[] args) {
        hasSharedDigit(44, 14);
    }
    public static boolean hasSharedDigit (int first, int second) {
        if ((first < 10 || first > 99) || (second < 10 || second > 99)) {return false;}
        String strFirst = Integer.toString(first % 10);
        String strSecond = Integer.toString(second % 10);

        for (int i = 0; i < strFirst.length(); ++i){
            if(strSecond.contains(strFirst.substring(i,1+i))) {
                return true;
            }
        }
        return false;
    }
}
