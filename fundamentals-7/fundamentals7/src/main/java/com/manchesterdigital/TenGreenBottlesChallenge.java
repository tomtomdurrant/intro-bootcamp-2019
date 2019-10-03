package com.manchesterdigital;

import java.lang.reflect.Array;

public class TenGreenBottlesChallenge {
    /*Ten green bottles, sitting on the wall,
     * Ten green bottles, sitting on the wall,
     * And if one green bottle, should accidentally fall,
     * There'll be nine green bottles, sitting on the wall.*/

    public static String[] numbers = new String[]{"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

    public static String verse(int numberOfGreenBottles) {
        StringBuilder verseComplete = new StringBuilder();
        verseComplete.insert(0, numbers[numberOfGreenBottles]);
        verseComplete.append(" green bottles, sitting on the wall,");
        verseComplete.append(System.getProperty("line.separator"));
        verseComplete.append(numbers[numberOfGreenBottles]);
        verseComplete.append(" green bottles, sitting on the wall,");
        verseComplete.append(System.getProperty("line.separator"));
        verseComplete.append("And if one green bottle should accidentally fall,");
        verseComplete.append(System.getProperty("line.separator"));
        verseComplete.append("There'll be ");
        verseComplete.append(numbers[numberOfGreenBottles - 1]);
        verseComplete.append(" green bottles sitting on the wall.");
        verseComplete.append(System.getProperty("line.separator"));
        verseComplete.append(System.getProperty("line.separator"));

        return String.valueOf(verseComplete);
    }


    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            System.out.println(verse(i));
        }
    }
}
