package com.manchesterdigital;

public class WhileExample {
    public static void main(String[] args) {
        /**
         * while (boolean expression) {
         * // body //
         * }
         */

        double growthRate = 0.04d; // 4 percent
        int population = 800; //initial population
        int year = 0;

        while (population <= 1200) {
            Double tempPopulation = population * (1 + growthRate);
            population = tempPopulation.intValue();
            year++;
        }

        System.out.println("year = " + year);
        System.out.println("population = " + population);

    }
}
