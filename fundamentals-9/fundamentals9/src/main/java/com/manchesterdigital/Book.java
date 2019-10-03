package com.manchesterdigital;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private Printer printer;

    //constructor, getters, setters etc...

    public Book(Printer printer) {
        this.printer = printer;
    }

    public boolean isInIsbn(String sequence) { //does the isbn contain this sequence
        return isbn.contains(sequence);
    }
    //This is not abiding by SRP -> gone to Printer
//    public void printToConsole() {
//        System.out.println(String.format("Book %s, Author %s, isbn %s", name, author, isbn));
//    }


}
