package com.manchesterdigital;

public class Lights implements Controls {
    @Override
    public void switchOn() {
        System.out.println("Pressing on switch");
    }
    @Override
    public void switchOff() {
        System.out.println("Pressing off switch");
    }
}
