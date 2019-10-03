package com.manchesterdigital.challenges;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapABCombinerTests {

    @Test
    public void whenNeitherANorBArePresentPrintNothingHasHappened() {
//        Arrange
        Map<String, String> mapAB = new HashMap<>();
//        Act
        Map<String, String> result = MapABCombiner.mapCombiner(mapAB);

//        Assert
        Assertions.assertThat(result).isEqualTo(mapAB);

    }

    @Test
    public void whenAisPresentReturnMapA() {
//        Arrange
        Map<String, String> mapAB = new HashMap<>();
//        Act
        mapAB.put("a", "Hi");
        Map<String, String> result = MapABCombiner.mapCombiner(mapAB);

//        Assert
        Assertions.assertThat(result).isEqualTo(mapAB);

    }
    @Test
    public void whenBisPresentReturnMapB() {
//        Arrange
        Map<String, String> mapAB = new HashMap<>();
//        Act
        mapAB.put("b", "There");
        Map<String, String> result = MapABCombiner.mapCombiner(mapAB);

//        Assert
        Assertions.assertThat(result).isEqualTo(mapAB);

    }
    @Test
    public void whenAAndBArePresentCreateAB() {
//        Arrange
        Map<String, String> mapAB = new HashMap<>();
//        Act
        mapAB.put("a", "Hi");
        mapAB.put("b", "There");
        Map<String, String> result = MapABCombiner.mapCombiner(mapAB);

//        Assert
        Assertions.assertThat(result).containsKeys("ab");

    }
    @Test
    public void whenAAndBArePresentReturnTheMapWithABAndConcatinatedAAndB() {
//        Arrange
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("a", "Hi");
        expectedMap.put("b", "There");
        expectedMap.put("ab", "HiThere");
        Map<String, String> mapAB = new HashMap<>();
//        Act
        mapAB.put("a", "Hi");
        mapAB.put("b", "There");
        Map<String, String> result = MapABCombiner.mapCombiner(mapAB);

//        Assert
        Assertions.assertThat(result).isEqualTo(expectedMap);

    }
}
