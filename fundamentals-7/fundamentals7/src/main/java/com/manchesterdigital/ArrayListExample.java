package com.manchesterdigital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList names1 = new ArrayList(); // Not good - generic way of creating ArrayList
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("John");
        names2.add("Sue");
        names2.add(2, "Steve");

        // Returns size of element (length)
        int numberOfElements = names2.size();
        System.out.println("Number of elements: " + numberOfElements);

        // Returns
        String firstElement = names2.get(0);
        System.out.println("First element: " + firstElement);

        String removedElement = names2.remove(0);
        System.out.println("Removed => " + removedElement);

        //Prints out value at index 0
        System.out.println(names2.get(0));

        // Removes Stever
        boolean removedElementsViaObject = names2.remove("Steve");
        System.out.println("Removed by object => " + removedElementsViaObject);



        ArrayList<String> zooAnimals = new ArrayList<>();
        zooAnimals.add("Lion");
        zooAnimals.add("Hippo");
        zooAnimals.add("Leopard");

        boolean containsLeopards = zooAnimals.contains("Leopard");//Returns true if it contains Leopard

        Collections.sort(zooAnimals);

        System.out.println("After sort, animal at index0: " + zooAnimals.get(0));

        Collections.shuffle(zooAnimals);

        System.out.println("Contains leopards? " + containsLeopards);
        // Replaces index 1 with Cheetah
        zooAnimals.set(1, "Cheetah"); //Returns the string added
        System.out.println(zooAnimals.get(1));

//      Empties arraylist
        zooAnimals.clear(); //Clears the array and doesn't return anything

        System.out.println(zooAnimals.size());

        int[] lotterArr = new int[10]; // Initialises an array with 10 spaces

        int[] lotteryArr2 = {1, 23, 45, 6, 88}; // Creates an array with these pre determined values in

        List<Integer> lotteryNumbers = Arrays.asList(1, 23, 45, 6, 88);
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 2, 3));


    }
}
