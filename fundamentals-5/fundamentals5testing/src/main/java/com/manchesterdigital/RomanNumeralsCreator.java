package com.manchesterdigital;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RomanNumeralsCreator {
    public static String createStringOfNumerals(int number) {
        ArrayList<ArrayList> romanNumeralsArrayList = new ArrayList<>();

        String createdRomanNumerals = "I";
        if (number == 1000) {
            createdRomanNumerals = "M";
        } else if (number == 500) {
            createdRomanNumerals = "D";
        } else if (number == 100) {
            createdRomanNumerals = "C";
        } else if (number == 50) {
            createdRomanNumerals = "L";
        } else if (number == 10) {
            createdRomanNumerals = "X";
        } else if (number == 5) {
            createdRomanNumerals = "V";
        }
        return createdRomanNumerals;
    }

}
