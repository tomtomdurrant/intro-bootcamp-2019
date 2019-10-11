package com.manchesterdigital;

import java.util.List;

public class FoodProcessor extends Machine implements BlendsFood, Rotatable {

    private final List<String> ingredients;

    public FoodProcessor(String manufacturer, Colours colours, String name, List<String> ingredients) {
        super(manufacturer, colours, name);
        this.ingredients = ingredients;
    }
Long
    @Override
    public void mixFoodContents() {
        ingredients.stream()
                .forEach(ingredient -> System.out.println("Mixing " + ingredient));
    }


    @Override
    public void rotate(int num) {
        System.out.println("Rotating " + num);
    }
}
