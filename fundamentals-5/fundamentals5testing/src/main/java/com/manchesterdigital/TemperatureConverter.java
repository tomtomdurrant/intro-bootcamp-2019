package com.manchesterdigital;

public class TemperatureConverter {

    public static final String CELSIUS_UNIT = "C";
    public static final String FAHRENHEIT_UNIT = "F";

    public static double convert(String unitToConvertTo, int temperature) {
        if (!unitToConvertTo.equalsIgnoreCase(CELSIUS_UNIT) &&
                !unitToConvertTo.equalsIgnoreCase(FAHRENHEIT_UNIT)) {
            throw new InvalidConverstionUnitException("Provided invalid unit: " + unitToConvertTo);
        }
        if (unitToConvertTo.equalsIgnoreCase(CELSIUS_UNIT)) {
            return calculateFahrenheitToCelsius(temperature);
        }
        return  calculateCelsiusToFahrenheit(temperature);
    }

    private static double calculateFahrenheitToCelsius(int fahrenheitValue) {
        return Math.ceil((fahrenheitValue - 32) * 5.0 / 9.0);
    }

    private static double calculateCelsiusToFahrenheit(int celsiusValue) {
        return Math.ceil(celsiusValue * 9.0 / 5.0) + 32;

    }

}
