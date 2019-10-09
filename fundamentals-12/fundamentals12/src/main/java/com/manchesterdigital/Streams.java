package com.manchesterdigital;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {


        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int result = 0;
        for (Integer i :
                numbers) {
            result += i * 2;
        }
        System.out.println("result = " + result);

        System.out.println(numbers.stream()
                .map(i -> i * 2)
                .reduce(0, Integer::sum));

        int sum = IntStream.range(0, 10)
                .sum();

        System.out.println("sum = " + sum);

        int anotherSum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("anotherSum = " + anotherSum);

        List<String> names = List.of("john", "amy", "jack");
        for (String name :
                names) {
            String uCase = name.toUpperCase();
            System.out.println("uCase = " + uCase);
        }

        List<String> upperCasedNames = names
                .stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("upperCasedNames = " + upperCasedNames);

        List<String> upperCasedUsingMethodReference = names
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("upperCasedUsingMethodReference = " + upperCasedUsingMethodReference);


        // Dealing with multiple streams
        List<List<String>> richPeople = List.of(
                List.of("Jeff Bezos"),
                List.of("Bill Gates"),
                List.of("Deborah Meadon"),
                List.of("Mark Zuckerberg"),
                List.of("Mark Zuckerberg")
        );

        List<String> flattenedRichPeople = richPeople.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("flattenedRichPeople = " + flattenedRichPeople);

        Set<String> flattenedRichPeopleNoDuplicates = richPeople.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        System.out.println("flattenedRichPeopleNoDuplicates = " + flattenedRichPeopleNoDuplicates);
    }
}
