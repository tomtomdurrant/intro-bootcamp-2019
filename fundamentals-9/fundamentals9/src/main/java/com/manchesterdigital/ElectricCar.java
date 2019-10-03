package com.manchesterdigital;

public class ElectricCar implements MoveVehicle {
    private Engine engine;

    // This is now unneccessary as we are abiding by the LSP @Override
//    public void startEngine() {
//        throw new UnsupportedOperationException("I'm engineless...");
//    }

    @Override
    public void accelerate() {
        engine.powerOn(3000);
    }
}
