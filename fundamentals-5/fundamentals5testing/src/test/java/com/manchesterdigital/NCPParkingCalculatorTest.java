package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NCPParkingCalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void whenTimeIs0CostIs300 () {
        // Arrange
        int startTime = 0;

        //Act
        double result = NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime);

        //Assert
        Assertions.assertThat(result).isEqualTo(NCPConstants.ZERO_TO_FIVE_COST*.75);
    }

    @Test
    public void whenTimeIs5CostIs350 () {
        // Arrange
        int startTime = 5;

        //Act
        double result = NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime);

        //Assert
        Assertions.assertThat(result).isEqualTo(350*.75);
    }

    @Test
    public void whenTimeIs10CostIs500 () {
        // Arrange
        int startTime = 10;

        //Act
        double result = NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime);

        //Assert
        Assertions.assertThat(result).isEqualTo(500*.75);
    }
    @Test
    public void whenTimeIs15CostIs700 () {
        // Arrange
        int startTime = 15;

        //Act
        double result = NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime);

        //Assert
        Assertions.assertThat(result).isEqualTo(700);
    }
    @Test
    public void whenTimeIs20CostIs400 () {
        // Arrange
        int startTime = 20;

        //Act
        double result = NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime);

        //Assert
        Assertions.assertThat(result).isEqualTo(400);
    }
    @Test
    public void whenTimeIs7CostIs350 () {
        // Arrange
        int startTime = 7;

        //Act
        double result = NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime);

        //Assert
        Assertions.assertThat(result).isEqualTo(350*.75);
    }

    @Test
    public void whenTimeIsMinus1InvalidTimeExceptionThrown () {
        // Arrange
        int startTime = -1;

        expectedException.expect(InvalidTimeException.class);

        //Act
        NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime);

        //Assert
        Assertions.assertThat(expectedException).isInstanceOf(InvalidTimeException.class);
    }
    @Test
    public void whenTimeIs25InvalidTimeExceptionThrown () {
        // Arrange
        int startTime = -25;

        expectedException.expect(InvalidTimeException.class);

        //Act
        NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime);

        //Assert
        Assertions.assertThat(expectedException).isInstanceOf(InvalidTimeException.class);
    }
    @Test
    public void whenVehicleIsVanAndTimeIs10CostIs1000 () {
        // Arrange
        int startTime = 10;
        VehicleType vehicle = VehicleType.VAN;

        //Act
        double result = NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime, vehicle);

        //Assert
        Assertions.assertThat(result).isEqualTo(750);
    }
    @Test
    public void whenVehicleIsVanAndTimeIs10CostIs750 () {
        // Arrange
        int startTime = 10;
        VehicleType vehicle = VehicleType.VAN;

        //Act
        double result = NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime, vehicle);

        //Assert
        Assertions.assertThat(result).isEqualTo(750);
    }
    @Test
    public void whenVehicleIsBusInvalidVehicleExceptionIsThrown () {
        // Arrange
        int startTime = 4;
        VehicleType vehicle = VehicleType.UNKNOWN;

        expectedException.expect(InvalidVehicleException.class);

        //Act
        NCPParkingCalculator.calculateCostFromTimeAndVehicle(startTime, vehicle);

        //Assert
        Assertions.assertThat(expectedException).isInstanceOf(InvalidTimeException.class);
    }



}
