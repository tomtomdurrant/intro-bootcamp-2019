package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TemperatureConverterTest {
    //Takes a temperature from celsius or fahrenheit and converts to the other


    //First Unit Test
    @Test
    public void whenFahrenheitIsZeroThenCelsiusIsMinus17() {
        //Arrange
        String unitToConvertTo = "C";
        int temperature = 0;

        //Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //Assert
        Assertions.assertThat(result).isEqualTo(-17.0);
    }

    @Test
    public void whenFahrenheitIs100ThenCelsiusIs38() {
        //Arrange
        String unitToConvertTo = "C";
        int temperature = 100;

        //Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //Assert
        Assertions.assertThat(result).isEqualTo(38.0);
    }
}
