package com.manchesterdigital.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class SquaresChallenge {
    public static void main(String[] args) {
        System.out.println("returnsListOfSquares(List.of(1, 2, 3, 4)) = " + returnsListOfSquares(List.of(1, 2, 3, 4)));

    }

    public static List<Integer> returnsListOfSquares(List<Integer> integerList) {
        return integerList.stream()
                .map(integer -> integer * integer)
                .collect(Collectors.toList());

    }
}
