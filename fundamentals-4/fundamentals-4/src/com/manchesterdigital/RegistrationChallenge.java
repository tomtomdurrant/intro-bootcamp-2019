package com.manchesterdigital;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Arrays;

public class RegistrationChallenge {


    private static String registrationGenerator (String input){
//        Result
        String [] inputAsArr = input.split("");

        switch (inputAsArr[0]) {
            case "A":
                inputAsArr[0] = "4";
                break;
            case "B":
                inputAsArr[0] = "8";
                break;
            case "G":
                inputAsArr[0] = "9";
                break;
            case "I":
                inputAsArr[0] = "1";
                break;
            case "S":
                inputAsArr[0] = "5";
                break;
            default:
        }
        switch (inputAsArr[1]) {
            case "A":
                inputAsArr[1] = "4";
                break;
            case "B":
                inputAsArr[1] = "8";
                break;
            case "G":
                inputAsArr[1] = "9";
                break;
            case "I":
                inputAsArr[1] = "1";
                break;
            case "S":
                inputAsArr[1] = "5";
                break;
            default:
        }
        switch (inputAsArr[2]) {
            case "A":
                inputAsArr[2] = "4";
                break;
            case "B":
                inputAsArr[2] = "8";
                break;
            case "G":
                inputAsArr[2] = "9";
                break;
            case "I":
                inputAsArr[2] = "1";
                break;
            case "S":
                inputAsArr[2] = "5";
                break;
            default:
        }
        switch (inputAsArr[3]) {
            case "A":
                inputAsArr[3] = "4";
                break;
            case "B":
                inputAsArr[3] = "8";
                break;
            case "G":
                inputAsArr[3] = "9";
                break;
            case "I":
                inputAsArr[3] = "1";
                break;
            case "S":
                inputAsArr[3] = "5";
                break;
            default:
        }
        switch (inputAsArr[4]) {
            case "A":
                inputAsArr[4] = "4";
                break;
            case "B":
                inputAsArr[4] = "8";
                break;
            case "G":
                inputAsArr[4] = "9";
                break;
            case "I":
                inputAsArr[4] = "1";
                break;
            case "S":
                inputAsArr[4] = "5";
                break;
            default:
        }
        switch (inputAsArr[5]) {
            case "A":
                inputAsArr[5] = "4";
                break;
            case "B":
                inputAsArr[5] = "8";
                break;
            case "G":
                inputAsArr[5] = "9";
                break;
            case "I":
                inputAsArr[5] = "1";
                break;
            case "S":
                inputAsArr[5] = "5";
                break;
            default:
        }
        switch (inputAsArr[6]) {
            case "A":
                inputAsArr[6] = "4";
                break;
            case "B":
                inputAsArr[6] = "8";
                break;
            case "G":
                inputAsArr[6] = "9";
                break;
            case "I":
                inputAsArr[6] = "1";
                break;
            case "S":
                inputAsArr[6] = "5";
                break;
            default:
        }
        return Arrays.toString(inputAsArr);
    }

    public static void main(String[] args) {
        System.out.println(registrationGenerator("AAAAAAA"));
        System.out.println(registrationGenerator("SK165RE"));
        System.out.println(registrationGenerator("SAIIBGH"));
        System.out.println(registrationGenerator("LLLLLLL"));
        System.out.println(registrationGenerator("YYYHHHH"));
    }
}
