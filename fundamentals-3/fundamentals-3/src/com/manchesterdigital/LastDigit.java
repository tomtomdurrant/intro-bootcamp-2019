package com.manchesterdigital;

public class LastDigit {
    public static void lastDigit(int var1, int var2) {
        System.out.println(var1 % 10 == var2 % 10);
    }

    public static void main(String[] args) {
        lastDigit(7,17);
        lastDigit(6, 17);
        lastDigit(3, 113);
    }
}
