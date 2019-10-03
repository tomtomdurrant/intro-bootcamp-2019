package com.manchesterdigital;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class ForLoop1or4 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(1);
        numbers.add(1);

        System.out.println("numbers result " + only1or4(numbers));
    }
    public static Boolean only1or4(ArrayList<Integer> numbers) {

        for (Integer number : numbers) {
            if ((!number.equals(1) || (!number.equals(4)))) {
                return false;
            }
        }
        return true;
    }
}
