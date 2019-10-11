package com.manchesterdigital;

import java.util.List;

public class MachineFactory {
    public static Machine getMachine(boolean usesMilk) {
        if (usesMilk) {
            return new MilkshakeMachine("milky", Colours.RED, "milk");
        }
        return new FoodProcessor("foody", Colours.BLUE, "food", List.of(""));
    }

    public static Rotatable getMachineByRotation(boolean usesMilk) {
        if (usesMilk) {
            return new MilkshakeMachine("milky", Colours.RED, "milk");
        }
        return new FoodProcessor("foody", Colours.BLUE, "food", List.of(""));
    }
}
