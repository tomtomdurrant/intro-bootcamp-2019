package com.manchesterdigital;

public class Tesla extends Vehicle implements Movement, IsChargeable{
    public Tesla(String colour, Integer numberOfSeats,
                 TransmissionType transmissionType, Double engineSize, String manufacturer) {
        super(colour, numberOfSeats, transmissionType, engineSize, manufacturer);
    }

    @Override
    public void moveForwards() {
        System.out.println("Moving tesla forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Moving tesla backward");
    }

    @Override
    public void supercharge() {

    }


}
