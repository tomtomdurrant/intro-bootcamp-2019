package com.manchesterdigital;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("enGb", "England");
        countries.put("esEs", "Spain");
        countries.put("ptPt", "Portugal");

        String key = "ptPt";
        String portugal = countries.get(key);
        System.out.println("portugal = " + portugal);

        countries.put(key, "Duncan");
        String duncan = countries.get(key);
        System.out.println("duncan = " + duncan);

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "John");
        names.put(2, "Andrew");
//        Removes item by key, returns the object removed.
        String removedName = names.remove(2);
        System.out.println("removedName = " + removedName);
//        Empties the map but keeps the initialised map
        names.clear();

        System.out.println("number of items = " + names.size());
        names.put(1, "April");
        names.put(2, "Sania");
        names.put(3, "Schmek");

        for (Map.Entry<Integer, String> namesIteration : names.entrySet()) {
            System.out.println("Key = " + namesIteration.getKey() + ", value = " + namesIteration.getValue());
        }

        for (Integer namesKey : names.keySet()) {
            System.out.println("namesKey = " + namesKey);
        }

        for (String namesValues : names.values()) {
            System.out.println("namesValues = " + namesValues);
        }

        if (names.containsKey(1)) {
            System.out.println("There is id 1");
        }
    }
}
