package com.manchesterdigital;

public class ReverseString {
    public static String reversal(String input) {
        StringBuilder finalString = new StringBuilder(input);
        return finalString.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(reversal("Hiyoooo"));
    }
}
