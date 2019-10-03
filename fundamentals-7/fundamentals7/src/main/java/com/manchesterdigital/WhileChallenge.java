package com.manchesterdigital;

import java.util.ArrayList;

public class WhileChallenge {
    public static void main(String[] args) {
        System.out.println("Sum is " + loopCalculator(1, 10).get(0));
        System.out.println("Average is " + loopCalculator(1, 10 ).get(1));;

    }

    public static ArrayList<Integer> loopCalculator(int startNumber, int endNumber) {
        int iteratedNumber = startNumber;
        int sum = 0;
        int count = 0;
        ArrayList<Integer> sumAndCount = new ArrayList<>();

        while (iteratedNumber <= endNumber) {
            sum += iteratedNumber;
            iteratedNumber++;
            count ++;
        }
        int average = sum / count;
        sumAndCount.add(sum);
        sumAndCount.add(average);
        return sumAndCount;
    }
}
