package com.manchesterdigital;

public interface HasMilk {
    void addMilk() throws IllegalStateException;
    default void addToChiller() {
        System.out.println("Chill out");
    }
}
