package com.company;

public class Main {

    public static void main(String[] args) {
        /*int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();*/
/*        double centimeters = calcFeetAndInchesToCentimeters(13, 1);
        System.out.println(centimeters);*/
        getDurationString(345839496);
        getDurationString(407);

    }
    public static String getDurationString (long minutes, long seconds) {
        if (minutes < 0 || (seconds > 59 || seconds < 0)) {
            System.out.println("Invalid value");
            return "Invalid value";
        }
        long hours = minutes / 60;
        minutes = minutes % (long) 60;

        String time = hours + "h " + minutes + "m " + seconds + "s";
        System.out.println(time);
        return time;
    }

    public static String getDurationString (long seconds) {
        if (seconds < 0) {
        return "Invalid value";
        }
        long minutes = seconds / (long) 60;
        seconds = seconds % (long) 60;
        return getDurationString(minutes, seconds);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet <= 0) || (inches < 0 || inches >= 12 )) {
            System.out.println("Invalid parameters");
            return -1;
        }
        double imperialTotalInches = (feet * 12) + inches;
        double metricTotalCentimeters = imperialTotalInches * 2.54;
        System.out.println(metricTotalCentimeters);
        return metricTotalCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches <= 0) {
            return -1;
        }
        double inchesRemainder = inches % (double) 12;
        double feet = (inches - inchesRemainder) / (double) 12;
        System.out.println("Feet: " + feet + "; Inches: " + inchesRemainder);
        calcFeetAndInchesToCentimeters(feet, inchesRemainder);
        return 0;
    };

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore( int score) {
        System.out.println("Unnamed player scored " + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No Player name, no player score");
        return 0;
    }
}

