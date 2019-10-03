package com.manchesterdigital;

public class ForLoopExample {
    public static void main(String[] args) {

        /**
         * for (initialisation; boolean expression; update statement) {
         *
         * }
         */

        for (int i = 0; i <= 100; i++) {
            System.out.println("i = " + i);
        }

        int x = 0;
        for (x = 0; x <= 100; x++) {
            System.out.println("x = " + x);
        }
        System.out.println("x outside " + x);

        // Example of infinite loop - Don't do this.
        // for (;;) {
        // }`
    }
}
