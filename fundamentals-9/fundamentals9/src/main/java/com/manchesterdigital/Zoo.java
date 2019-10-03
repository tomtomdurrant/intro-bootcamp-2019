package com.manchesterdigital;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {

//        Animal animal = new Animal(20, "female", 100);
//        animal.eat();
//        animal.sleep();

//        Bird bird = new Bird(23, "Male", 20, 60);
        Chicken bernardMatthews = new Chicken(23, "Female", 15, 10);
        bernardMatthews.move();
        bernardMatthews.eat();
        bernardMatthews.sleep();

        Magpie maggie = new Magpie(32, "Male", 50, 30);
        List<Animal> animals = new ArrayList<Animal>(); // This arraylist could be of type bird,
        // as the contents are only birds
        animals.add(maggie);
        animals.add(bernardMatthews);

        for (Animal animal : animals) // Animal is the type of variable,
            // animal is the local variable, animals is the arraylist you are cycling through
        {
            animal.move(); // As all animals have a move class, you can call them with the for each loop
        }

        Flyable someAnimalThatFlys = new Magpie(32, "Male", 50, 30);
        // This creates another instance of magpie but is a different way of creating it.
        List<Flyable> flyables = new ArrayList<Flyable>();
        flyables.add(maggie);
//        flyables.add(bernardMatthews);    Not an implementor of Flyable.
    }
}
