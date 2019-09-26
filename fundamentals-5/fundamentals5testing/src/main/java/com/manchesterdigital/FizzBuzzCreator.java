package com.manchesterdigital;

public class FizzBuzzCreator {

/*    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(testIfFizzBuzz(i));
        }

    }*/
    public static String testIfFizzBuzz(int number) {
        String result = String.valueOf(number);

        if ( ( (number % 3 == 0) && (number % 5 == 0) ) )
            return "fizzbuzz";
        else if ( (number % 3 ) == 0 ){
            result = "fizz";
        } else if ( (number % 5) == 0){
            result = "buzz";
        }
        return result;
    }
}
