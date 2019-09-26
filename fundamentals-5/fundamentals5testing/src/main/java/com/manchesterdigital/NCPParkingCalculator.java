package com.manchesterdigital;

import static com.manchesterdigital.NCPConstants.*;
import static com.manchesterdigital.VehicleType.*;

public class NCPParkingCalculator {

    public static double calculateCostFromTimeAndVehicle(int startTime, VehicleType vehicleType) {
        if (!vehicleType.equals(VAN) &&
                (!vehicleType.equals(CAR))) {
            throw new InvalidVehicleException("Provided Invalid Vehicle " + vehicleType);
        }
        if (vehicleType.equals(VAN)) {
            return calculateIfTimeIsBefore3(startTime) * 2;
        }
        return calculateIfTimeIsBefore3(startTime);
    }

    public static double calculateCostFromTimeAndVehicle(int startTime) {
        return calculateCostFromTimeAndVehicle(startTime, CAR);
    }

    public static double calculateIfTimeIsBefore3(int startTime ) {
        if (startTime < 15) {
            return costCalculator(startTime) * .75;
        }
        return costCalculator(startTime);
    }

    private static int costCalculator(int startTime) {
        if ( (startTime < 0 ) || (startTime > 23) ) {
            throw new InvalidTimeException("Provided invalid time: " + startTime);
        }

        int costGivenTime = TWENTY_TO_TWENTY_FOUR;

        if (startTime < FIVE_AM) {
            costGivenTime = ZERO_TO_FIVE_COST;
        } else if (startTime < TEN_AM) {
            costGivenTime = FIVE_TO_TEN_COST;
        } else if ( startTime < THREE_PM) {
            costGivenTime = TEN_TO_FIFTEEN_COST;
        } else if ( startTime < EIGHT_PM) {
            costGivenTime =  FIFTEEN_TO_TWENTY_COST;
        }
        return costGivenTime;
    }
}
