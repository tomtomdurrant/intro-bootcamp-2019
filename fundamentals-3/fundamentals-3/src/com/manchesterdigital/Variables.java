package com.manchesterdigital;

public class Variables {
    static boolean isHungry = false;

    public static void main(String[] args) {
        greetWhenAdult(20);
    }

    /**
     * Greets based on age.
     *
     * @param age this is the age required.
     */
    private static void greetWhenAdult(int age) {
//        This is a local variable and only accessible within this method
        boolean isHappy = true;

        if (isHappy && age >= 18) {
            System.out.println("Hello");
        }
    } //end of class
}
