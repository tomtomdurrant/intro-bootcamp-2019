package com.manchesterdigital;

import java.util.List;
import java.util.Map;

public enum Dishes {
    //Think like key value pairs, key is dish, value is the string
    MEXICAN("tacos", 90),
    INDIAN("daal", 70),
    FRENCH("snails", 0),
    GERMAN("bratwurst", 100);

    public static Map<Dishes, String> dishesToDishNameMap;

    static {
        dishesToDishNameMap = Map.of(
                MEXICAN, "tacos",
                INDIAN, "daal",
                FRENCH, "snails",
                GERMAN, "bratwurst"
        );
    }

    private final String dishName;
    private final Integer heatLevel;

    Dishes(String dishName, Integer heatLevel) {
        this.dishName = dishName;
        this.heatLevel = heatLevel;
    }

    public String getDishName() {
        return dishName;
    }

    public Integer getHeatLevel() {
        return heatLevel;
    }

    public static Dishes retrieveByDishName(String requiredDishName) {
    /*    if (dishesToDishNameMap.containsValue(requiredDishName)) {
            return dishesToDishNameMap.entrySet()
                    .stream()
                    .filter(dishesStringEntry -> dishesStringEntry.getValue().equalsIgnoreCase(requiredDishName))
                    .findFirst()
                    .get().getKey();
        }
        return null;*/
        return dishesToDishNameMap.entrySet()
                .stream()
                .filter(dishesStringEntry -> dishesStringEntry.getValue().equalsIgnoreCase(requiredDishName))
                .findFirst().orElseThrow(IllegalArgumentException::new)
                .getKey();
    }

}
