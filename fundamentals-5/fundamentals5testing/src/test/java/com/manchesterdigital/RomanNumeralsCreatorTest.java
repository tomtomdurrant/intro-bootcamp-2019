package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.beans.PropertyEditorSupport;

public class RomanNumeralsCreatorTest {

    @Test
    public void whenInputIs1OutcomeIsI() {
//        Arrange
        int number = 1;

//        Act
        String result = RomanNumeralsCreator.createStringOfNumerals(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("I");
    }
    @Test
    public void whenInputIs5OutcomeIsV() {
//        Arrange
        int number = 5;

//        Act
        String result = RomanNumeralsCreator.createStringOfNumerals(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("V");
    }
    @Test
    public void whenInputIs10OutcomeIsX() {
//        Arrange
        int number = 10;

//        Act
        String result = RomanNumeralsCreator.createStringOfNumerals(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("X");
    }
    @Test
    public void whenInputIs50OutcomeIsL() {
//        Arrange
        int number = 50;

//        Act
        String result = RomanNumeralsCreator.createStringOfNumerals(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("L");
    }
    @Test
    public void whenInputIs100OutcomeIsC() {
//        Arrange
        int number = 100;

//        Act
        String result = RomanNumeralsCreator.createStringOfNumerals(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("C");
    }
    @Test
    public void whenInputIs500OutcomeIsD() {
//        Arrange
        int number = 500;

//        Act
        String result = RomanNumeralsCreator.createStringOfNumerals(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("D");
    }
    @Test
    public void whenInputIs1000OutcomeIsM() {
//        Arrange
        int number = 1000;

//        Act
        String result = RomanNumeralsCreator.createStringOfNumerals(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("M");
    }
    @Test
    public void whenInputIs6OutcomeIsVI() {
//        Arrange
        int number = 6;

//        Act
        String result = RomanNumeralsCreator.createStringOfNumerals(number);

//        Assert
        Assertions.assertThat(result).isEqualTo("VI");
    }

}
