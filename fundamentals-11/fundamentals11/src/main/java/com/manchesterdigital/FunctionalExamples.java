package com.manchesterdigital;

import java.util.List;
import java.util.function.Function;

public class FunctionalExamples {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 4, 5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers.get(i) = " + numbers.get(i));
        }

        for (Integer i :
                numbers) {
            System.out.println("i = " + i);
        }

        String name = "John";

        // LAMBDA
        /** A lambda expression is a list of parameters separated by commas
         * ->
         * (expression body which contains one or more statements)
         */

        NumericTest isEven = (n) -> (n % 2 == 0);

        System.out.println(
                "Is 4 an even number? " + isEven.computeTest(4)
        );

        NumericTest isNegative = n -> n < 0;
        System.out.println(
                "-1 is negative? " + isNegative.computeTest(-1)
        );

        NumericTest isOdd = (n) -> false;

        Greeting greetInFrench = () -> System.out.println("Bonjour");
        Greeting greetInSpanish = () -> System.out.println("Hola");

        //You have to call the
        greetInFrench.message();
        greetInSpanish.message();

        //Object of type function, takes in string - returns integer
        Function<String, Integer> getWordLength = new Function<String, Integer>() {
            @Override
            //Overrides the generic apply which returns the length of the word given
            //Old way of doing it
            public Integer apply(String word) {
                return word.length();
            }
        };
        Integer helloLength = getWordLength.apply("Hello");
        System.out.println("helloLength = " + helloLength);

        //Uses the in built length method in java, the compiler works out the best way of doing this.
        Function<String, Integer> getWordLengthModernised = String::length;
        Integer theLength = getWordLengthModernised.apply("The");
        System.out.println("theLength = " + theLength);

        Function<Artist, String> extractArtistName = Artist::getName;
        Function<String, String> convertToUpperCase = String::toUpperCase;

        //New artist
        Artist skepta = new Artist("Skepta", 2_000_000L);


        String artistName = extractArtistName.apply(skepta);
        String upperCasedName = convertToUpperCase.apply(artistName);
        System.out.println("upperCasedName = " + upperCasedName);

        // One function instead of 2
        String allFunctions = extractArtistName.andThen(convertToUpperCase).apply(skepta);
        String allFunctionsWithoutCreatingNewFunction = extractArtistName.
                andThen(String::toUpperCase).apply(skepta);
        System.out.println("allFunctionsWithoutCreatingNewFunction = " + allFunctionsWithoutCreatingNewFunction);

        Integer inBuiltJDKFunctions = extractArtistName.andThen(String::length).apply(skepta);
        System.out.println("inBuiltJDKFunctions = " + inBuiltJDKFunctions);

        Function<Integer, Double> half = a -> a / 2.0d;
        // .compose method will run first
        half = half.compose(a -> a + 3);
        System.out.println("half.apply(5) = " + half.apply(101));

    }
}
