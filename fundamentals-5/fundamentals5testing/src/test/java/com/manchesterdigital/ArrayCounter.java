package com.manchesterdigital;

public class ArrayCounter {
    public static int countSheep(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};


        System.out.println(countSheep(array1));
    }
}
