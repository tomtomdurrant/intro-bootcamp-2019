
package com.manchesterdigital;

import java.util.Map;

public class Scratch {
    private static Map<Long, String> countries;


    static {
        countries = Map.of(
                1L, "England",
                2L, "France"
        );
    }


    private static String author = "Tom"; //Whenever a Scratch class is created, you need to provide it an author
    public Scratch(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {

        System.out.println(Scratch.author);
        int numberOfEmployees = 12;
        String firstName = "John";
        String lastName = null;

        Scratch newScratch = new Scratch(firstName);

        System.out.println(Scratch.author);
        System.out.println("countries.size() = " + countries.size());


    }

}
