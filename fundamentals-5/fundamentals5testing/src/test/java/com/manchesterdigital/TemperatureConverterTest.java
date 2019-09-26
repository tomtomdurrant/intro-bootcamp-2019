package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TemperatureConverterTest {
    //Takes a temperature from celsius or fahrenheit and converts to the other
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

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

    @Test
    public void whenFahrenheitIs50thenCelsiusIs10() {
        //Arrange
        String unitToConvertTo = "C";
        int temperature = 50;

        //Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //Assert
        Assertions.assertThat(result).isEqualTo(10.0);
    }

    // ------------- CELSIUS TO FAHRENHEIT TESTS -----///


    @Test
    public void whenCelsiusIsZeroFahrenheitIs32() {
        //Arrange
        String unitToConvertTo = "F";
        int temperature = 0;

        //Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //Assert
        Assertions.assertThat(result).isEqualTo(32.0);

    }

    @Test
    public void whenCelsiusIs35FahrenheitIs95() {
        //Arrange
        String unitToConvertTo = TemperatureConverter.FAHRENHEIT_UNIT;
        int temperature = 35;

        //Act
        double result = TemperatureConverter.convert(unitToConvertTo, temperature);

        //Assert
        Assertions.assertThat(result).isEqualTo(95.0);
    }



    @Test(expected = InvalidConverstionUnitException.class)
    public void whenConversionUnitIsNotValidThenExceptionThrown() {
        TemperatureConverter.convert("sfghdsfhggshadsfdsd", 0);
    }


//    Better practice, as it has an assertion
    @Test
    public void whenConversionUnitIsNotValidThenExceptionThrown2() {
        expectedException.expect(InvalidConverstionUnitException.class);

        TemperatureConverter.convert("sfghdsfhggshadsfdsd", 0);

        Assertions.assertThat(expectedException).isInstanceOf(InvalidConverstionUnitException.class);
    }
}
