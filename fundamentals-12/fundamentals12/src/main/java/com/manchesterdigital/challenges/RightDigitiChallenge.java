package com.manchesterdigital.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigitiChallenge {
    public static void main(String[] args) {
        System.out.println("rightNumber(List.of(93, 86, 101)) = " + rightNumber(List.of(93, 86, 101)));
    }

    private static List<Integer> rightNumber(List<Integer> integerList) {
        return integerList.stream()
                .map(i -> i % 10)
                .collect(Collectors.toList());
    }
}
