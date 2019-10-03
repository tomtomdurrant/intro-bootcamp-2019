package com.manchesterdigital;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ForLoopChallenge2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your word?");
        String str = input.nextLine();

        System.out.println("How many times?");
        int n = input.nextInt();

        System.out.println(stringTimes(str, n));
    }

    public static StringBuilder stringTimes(String str, int n) {
        StringBuilder builderString = new StringBuilder();

        for (int i = 0; i < n ; i++) {
            builderString.append(str);
        }
        return builderString;

    }
}
