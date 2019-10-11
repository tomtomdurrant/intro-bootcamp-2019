package com.manchesterdigital;

import java.util.List;

public class Archies {
    public static void main(String[] args) {
//        Machine machine = new Machine("zanussi", Colours.BLUE, "mega");
//        System.out.println("machine.toString() = " + machine.toString());

        MilkshakeMachine milkshakeMachine = new MilkshakeMachine("sony", Colours.PINK, "smoothie");
        System.out.println("milkshakeMachine = " + milkshakeMachine.toString());
        List<String> ingredients = List.of("carrots", "bananas");
        milkshakeMachine.addToChiller();

        FoodProcessor foodProcessor = new FoodProcessor("samsung", Colours.RED, "blender", ingredients);
        System.out.println("foodProcessor.toString() = " + foodProcessor.toString());

        foodProcessor.mixFoodContents();

        Machine machine = MachineFactory.getMachine(true);
        Rotatable machineByRotation = MachineFactory.getMachineByRotation(false);
        machineByRotation.rotate(5);

    }

}
