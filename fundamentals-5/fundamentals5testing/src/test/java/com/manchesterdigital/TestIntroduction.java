package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestIntroduction {
    @Test
    public void testThatABankAccountTakesAnInputWhenDeposited() {

    }

    @Test
    public void shouldTakeInputWhenDeposited() {

    }
    //BDD STYLE (Behavioural Driven Development):
    @Test
    public void givenBankAccountWhenInputThenDeposited() {
    }

    @Test
    public void shouldAddTwoNumbers() {
        //ARRANGE
        int first = 23;
        int second = 23;

        //ACT
        int result = first + second;

        //ASSERT
        assertThat(result).isEqualTo(46);


    }
}
