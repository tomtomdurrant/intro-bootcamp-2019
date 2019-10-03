package com.manchesterdigital;

public class Toyota extends Vehicle implements Movement {
    public Toyota(String colour, Integer numberOfSeats,
                  TransmissionType transmissionType, Double engineSize, String manufacturer) {
        super(colour, numberOfSeats, transmissionType, engineSize, manufacturer);
    }

    @Override
    public void moveForwards() {
        System.out.println("Moving toyota forwards");
    }

    @Override
    public void moveBackwards() {
        System.out.println("Moving toyota backwards");
    }
}
