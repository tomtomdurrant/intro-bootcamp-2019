package com.manchesterdigital;

import java.util.Map;

public class ExternalScratch {
    private static Map<Long, String> countries;



    public static void main(String[] args) {
        Scratch externalScratch = new Scratch("Tom");
        System.out.println("countries.get(1L) = " + countries.get(2L));
    }
}
