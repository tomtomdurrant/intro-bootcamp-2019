package com.manchesterdigital;

import java.lang.reflect.Array;

public class ExceptionExample {
    public static void main(String[] args) {
        int [] intArray = {12, 3, 5};

        printArray(0, intArray);
        printArray(1, intArray);
        printArray(2, intArray);

        //This is out of bounds so will cause an exception
        try {
            printArray(3, intArray);
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.err.println("Element does not exist: " + ae);
        }
    }

    public static void printArray( int index, int [] arr) {
        System.out.println("Element " + index + " is " + arr[index]);
    }
}
