package com.manchesterdigital;

public class InterestCalculator {
    public static void main(String[] args) {
        double amount = 100.0d;

        for (int i = 0; i <= 10; i++) {
            System.out.println(calculateInterest(amount, i));
        }
    }

    private static double calculateInterest(double amount, int i) {
        return (amount * i) / 100;
    }
}
