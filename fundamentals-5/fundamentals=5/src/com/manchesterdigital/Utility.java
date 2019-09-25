package com.manchesterdigital;

public class Utility {
    public static Boolean isEven(int a){
        return ((a % 2) == 0);
    }

    public static Boolean isNameMatch( String firstName, String lastName) {
        return (firstName.equalsIgnoreCase(lastName));
    }

    /**
     * Test of creating javadoc.
     * @param input String to convert to number
     * @return Number as a string
     * @throws NumberFormatException
     */
    public static Long convertStringToLong(String input)
            throws NumberFormatException {
        return new Long(input);
    }

}
