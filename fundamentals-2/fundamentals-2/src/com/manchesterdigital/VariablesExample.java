package com.manchesterdigital;

import java.util.Arrays;
import java.util.Currency;
import java.util.Date;

public class VariablesExample {
    public static void main(String[] args) {

//        Primitives
        int Number = 10; //Bad
        int numberOfAnimals = 10; //Good

        System.out.println("Number of animals is: " + numberOfAnimals );

        int i1, i2 ,i3; //Not good

        /*
        This declares 3 variables of type int, however only d3 will be set to 3.
        */
        int d1, d2, d3 = 3;

        long diameterOfTheSunInMetres = 12L;

//        Can include _ inside for ease of seeing
        int miles = 1_000_000;

        boolean itsRaining = true;

        float pi = 3.14f;
        double percentage = 49.5d;

        char initial = 'D';

//        Reference types
        String firstName  = "John";
        String lastName = "Doe";

        /* This creates 4 strings.
        First Name
        Last Name
        Anonymous (space)
        Whole string
         */
        System.out.println(firstName + " " + lastName);
        System.out.printf("Name: %s %s", firstName, lastName);

        System.out.println(String.format("Name: %s %s", firstName, lastName));

//      String Builder

        StringBuilder outputVariable = new StringBuilder();

        outputVariable.append(firstName);
        outputVariable.append(" ");
        outputVariable.append(lastName);

        System.out.println(outputVariable.toString());

//        Array
        int [] numbers = new int[10];
        numbers[0] = 99;

//        This will print 99 on its own
//        Not great
        System.out.println(numbers[0]);

//        This will print the location of numbers in the memory
//        Not great
        System.out.println(numbers);

//        This will print 99 as well, using the java utility classes, this prints the trailing 0's also.
//        Not great
        System.out.println(Arrays.toString(numbers));

        int [] lotteryNumbers = { 23, 45, 66 };

//        Error as there is no value in position 6
//        System.out.println(lotteryNumbers[6]);


        System.out.println(lotteryNumbers[2]);

        Date today = new Date();
        System.out.println(today.getTime());
        Currency dollarDollarBills =

    }
    /**
     * To deprecate something do this
     * To link to something else {@link CodingStandards}
     * */
    @Deprecated
    private static void hello() {
        System.out.println("Hello");
    }
}
