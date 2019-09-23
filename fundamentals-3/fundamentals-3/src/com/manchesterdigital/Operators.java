package com.manchesterdigital;

import org.w3c.dom.ls.LSOutput;

public class Operators {
    public static void main(String[] args) {

//        Example of addition operator
        int result = 1 + 2;
        System.out.println("Result is " + result);

//    subtract
        result = 3 - 1;
        System.out.println("Result is " + result);

//        multiplication
        result = 5 * 9;
        System.out.println("Result is " + result);

//        Division
        result = 10 / 5;
        System.out.println("Result is " + result);

//        Modulus
        result = 20 % 10;
        System.out.println("Result is " + result);

//        Increment
        result = result + 1;
        System.out.println("Result is " + result);

//        Abbreviated
        result++;
        System.out.println("Result is " + result);

//        Pre Increment
        ++result;
        System.out.println("Result is " + result);

//        Decrement
        result = result - 1;
        System.out.println("Result is " + result);

//        Abbreviated
        result--;
        System.out.println("Result is " + result);

//        Pre Decrement
        --result;
        System.out.println("Result is " + result);

//        Addition operator in abbreviated way
        result += 3;
        System.out.println("Result is " + result);

//        Subtraction operator in abbreviated way
        result -= 10;
        System.out.println("Result is " + result);

//        Muliplication operator in abbreviated way
        result *= 20;
        System.out.println("Result is " + result);

//        Division operator in abbreviated way
        result /= 20;
        System.out.println("Result is " + result);


        boolean isRainingToday = false;
        int number1 = 100;
        int number2 = 200;

        if (number1 != number2) {
            System.out.println("Not same");
        }
//        Other operators >, >=, <, <=, !=, ==, && (AND), ||(OR), ^(XOR),

        int degreeScore = 60;
        int overallScore = 100;

        if (degreeScore >= 60 && overallScore >= 100) {
            System.out.println("Woohoo");
        }

        if (degreeScore >= 60 || overallScore >= 100) {
            System.out.println("Woop");
        }

        boolean isAnimal = false;
//        Booleans can change with 1 equals in an if statement
//        This will print out
        if (isAnimal = true) {
            System.out.println("I am an animal");
        }

        String lastName = "Sousa";
        if (lastName.equalsIgnoreCase("SOUSA")) {
            System.out.println("Hey");
        }

        int numberOfMealsToday = 1;
        boolean isHungry = numberOfMealsToday == 1 ? true : false;


//Not operator
        if(!isRainingToday) {
            System.out.println("You won't need a jacket");
        }
    }
}
