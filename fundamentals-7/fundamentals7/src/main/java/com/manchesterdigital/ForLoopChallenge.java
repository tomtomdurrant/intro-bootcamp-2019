package com.manchesterdigital;

public class ForLoopChallenge {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 1; i <= 500; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                number += i;
                System.out.println("i = " + i);
                System.out.println("Total = " + number);
            }
        }
        System.out.println("Final Total " +number);
    }
}
