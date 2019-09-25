package com.manchesterdigital;

import jdk.jshell.execution.Util;

public class Runner {

    public static void main(String[] args) {

        /*Boolean result = Utility.isEven(2);
        System.out.println("Result: " + result);
        Boolean nameResult = Utility.isNameMatch("John", "Steve");
        System.out.println("Result: " + nameResult);
        Dog poodle = new Dog(20);
        System.out.println(poodle.bark());
        Dog rottweiler = new Dog(100);
        System.out.println(rottweiler.bark());
        Dog.relieve();
        System.out.println(Dog.NUMBER_OF_TEETH);
*/
        Long id;

        try {
            id = Utility.convertStringToLong("AAAA");
            System.out.println(aLong);
        }
        catch (NumberFormatException ConvertToLongException){
            System.err.println("Input provided was not a valid number: " + ConvertToLongException);
            id = Long.MAX_VALUE;
        }
        finally {
            
        }


    }
}
