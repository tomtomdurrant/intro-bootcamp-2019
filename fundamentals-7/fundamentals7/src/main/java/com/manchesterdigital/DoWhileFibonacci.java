package com.manchesterdigital;

import java.util.ArrayList;

public class DoWhileFibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacciMethod(80));
    }

    public static ArrayList<Integer> fibonacciMethod(Integer maxiumumValue) {

        ArrayList<Integer> arrayOfFibonacciNumbers = new ArrayList<>(); //Initialises an array to keep the fibonacci numbers
        arrayOfFibonacciNumbers.add(0, 0); //Manually adding the first 2 numbers to the array
        arrayOfFibonacciNumbers.add(1, 1);

        int nextFibonacciNumber = 0;
        int index = 0;

        while (nextFibonacciNumber <= maxiumumValue) {
            nextFibonacciNumber = arrayOfFibonacciNumbers.get(index) + arrayOfFibonacciNumbers.get(index + 1);
            arrayOfFibonacciNumbers.add(index + 2, nextFibonacciNumber);
            index++;
        }
        return arrayOfFibonacciNumbers;
    }
}
