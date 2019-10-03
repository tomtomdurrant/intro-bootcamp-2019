package com.manchesterdigital;

public class Fan implements Controls {

    @Override
    public void switchOn() {
        System.out.println("Turning on");
    }

    @Override
    public void switchOff() {
        System.out.println("Turning off");
    }
}
