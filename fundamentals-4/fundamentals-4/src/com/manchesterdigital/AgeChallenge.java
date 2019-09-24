package com.manchesterdigital;

public class AgeChallenge {
    /*Create a method which takes in a stiring and age, if the age is > 60, then the string is printed twice.
    Otherwise it is printed once.*/

    public static void main(String[] args) {
        printAge("Hey", 67);
        printAge("Kwlio", 40);
    }

    private static void printAge( String string, int age) {
        if (age > 60) {
            System.out.println(string);
            System.out.println(string);
        }
        System.out.println(string);
    }
}
