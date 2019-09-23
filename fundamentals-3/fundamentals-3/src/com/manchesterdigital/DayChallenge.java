package com.manchesterdigital;

public class DayChallenge {
    private static void isItAWeekday(int day) {
        if (day <= 6) {
            System.out.println("It is a weekday");
        }
    }

    public static void whatAmIDoing(int day) {
        if (day == 2) {
            System.out.println("It is a Tuesday. You are going to the gym.");
        } else if (day == 4) {
            System.out.println("It is a Thursday. You are going to the gym.");
        } else if (day == 7) {
            System.out.println("It is a Sunday. You are doing gardening. Soz. ");
        }
    }

    public static void main(String[] args) {
        isItAWeekday(4);
        whatAmIDoing(4);
    }
}


