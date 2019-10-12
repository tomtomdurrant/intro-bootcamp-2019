package com.manchesterdigital;

public class    EnumsExample {
    public static void main(String[] args) {
        for (Colours value : Colours.values()) {
            System.out.println("value = " + value);
        }
        System.out.println("Dishes.MEXICAN.getDishName() = " + Dishes.MEXICAN.getDishName());
        System.out.println("Dishes.MEXICAN.getHeatLevel() = " + Dishes.MEXICAN.getHeatLevel());

        String dishName = "tacos";

        Dishes dishesTacosMexican = Dishes.retrieveByDishName(dishName);
        System.out.println("dishesTacosMexican = " + dishesTacosMexican);

        String fish = "Fish";

        System.out.println("Dishes.retrieveByDishName(fish) = " + Dishes.retrieveByDishName(fish));

    }
}
