package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void whenNumberIs15OutcomeIsfizzbuzz() {
//        Arrange
        int number = 15;

//        Act
        String result = FizzBuzzCreator.testIfFizzBuzz(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("fizzbuzz");

    }

    @Test
    public void whenNumberIs3OutcomeIsfizz() {
//        Arrange
        int number = 3;

//        Act
        String result = FizzBuzzCreator.testIfFizzBuzz(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("fizz");
    }

    @Test
    public void whenNumberIs5OutcomeIsbuzz() {
//        Arrange
        int number = 5;

//        Act
        String result = FizzBuzzCreator.testIfFizzBuzz(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("buzz");

    }
    @Test
    public void whenNumberIs6OutcomeIsfizz() {
//        Arrange
        int number = 6;

//        Act
        String result = FizzBuzzCreator.testIfFizzBuzz(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("fizz");

    }
    @Test
    public void whenNumberIs10OutcomeIsbuzz() {
//        Arrange
        int number = 10;

//        Act
        String result = FizzBuzzCreator.testIfFizzBuzz(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("buzz");

    }
    @Test
    public void loopThroughEveryValueToCheckfizzbuzzOutcome() {
//        Arrange
        int number = 0;

//        Act
        String result = FizzBuzzCreator.testIfFizzBuzz(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz");

    }
}
