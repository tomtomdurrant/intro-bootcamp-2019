package com.manchesterdigital;

public class MilkshakeMachine extends Machine implements HasMilk, Rotatable {

    public MilkshakeMachine(String manufacturer, Colours colours, String name) {
        super(manufacturer, colours, name);
    }

    @Override
    public void addMilk() {
        System.out.println("Adding Milk to machine...");
    }

    @Override
    public void rotate(int num) {
        System.out.println("Rotating " + num + " times");
    }
}
