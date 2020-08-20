package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(5255666);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long day = (minutes / 60 / 24);
        String dayFinal = "";
        String yearFinal = "";
        long year = day / 365;

        if (year > 0) {
            day = day % 365;
        } else {
            day = day;
        }
/*        if (year < 10) {
            yearFinal = "0" + Long.toString(year);
        } else {
            yearFinal = Long.toString(year);
        }
        if (day < 10) {
            dayFinal = "0" + Long.toString(day);
        } else {
            dayFinal = Long.toString(day);
        }*/
        dayFinal = Long.toString(day);
        yearFinal = Long.toString(year);
        System.out.println(minutes + " min = " + yearFinal + " y " + dayFinal + " d");
    }
    public static String addZero(long date) {
        if (date == 0) {
            return "00";
        }
        else if (date < 10) {
            return "0" + Long.toString(date);
        } else {
            return Long.toString(date);
        }
    }
}
