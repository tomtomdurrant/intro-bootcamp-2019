package com.manchesterdigital.challenges;

import java.util.function.Function;

public class LambdaChallenge {
    public static void main(String[] args) {
        LambdaTest byTwo = (n) -> (n * 2);
        Integer answer1 = byTwo.multiplyByTwo(6);
        System.out.println("answer1 = " + answer1);

        Function<Integer, Integer> functionTimesByTwo = a -> a * 2;
        Integer answer2 = functionTimesByTwo.apply(8);
        System.out.println("answer2 = " + answer2);

        MultiplyTest multiplyTogether = (x, y) -> (x * y);
        Integer multipliedTogetherNumbersInterface = multiplyTogether.multiplyTogether(7, 8);
        System.out.println("multipliedTogetherNumbersInterface = " + multipliedTogetherNumbersInterface);

        Function<Numbers, Integer> functionMultiplyTogether = a -> (a.getA() * a.getB());
        Integer multipliedTogetherNumbers = functionMultiplyTogether.apply(new Numbers(10, 7));
        System.out.println("multipliedTogetherNumbers = " + multipliedTogetherNumbers);


        //Divide
        Divider divider = (a, b) -> a / b;
        Double doubleResult = divider.divideIt(6d, 3d);
        System.out.println("doubleResult = " + doubleResult);

        //this will fail
        Double doubleResult2 = divider.divideIt(6d, 0d);

        //Better
        Divider safeDivider = (a, b) -> {
            if (b == 0) {
                return 0d;
            }
            return a / b;
        };

        Divider safeDivider2 = (a, b) -> (b == 0) ? b : a / b;

        Function<DivideNumbers, Double> dividerFunc = (a) -> (a.getB() == 0 ? a.getB() : a.getA() / a.getB());
        System.out.println("dividerFunc.apply(8, 4) = " + dividerFunc.apply(new DivideNumbers(8d, 4d)));



        };
    }