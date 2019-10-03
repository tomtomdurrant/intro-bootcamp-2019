package com.manchesterdigital.challenges;

import java.util.HashMap;
import java.util.Map;

public class MapABCombiner {
    public static Map<String, String> mapCombiner(Map<String, String> mapAB) {
        if (mapAB.containsKey("a") && mapAB.containsKey("b")) {
            Map<String, String> resultMap = new HashMap<>();
            resultMap.putAll(mapAB);
            resultMap.put("ab", mapAB.get("a") + mapAB.get("b")); //Created a new map to store the values
            // Original map that is mutated mapAB.put("ab", mapAB.get("a") + mapAB.get("b"));
            return resultMap;
        }
        return mapAB;
    }
}