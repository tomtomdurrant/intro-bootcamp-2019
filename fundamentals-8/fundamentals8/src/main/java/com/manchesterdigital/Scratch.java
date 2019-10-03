package com.manchesterdigital;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scratch {

    public static final String RED_COLOUR = "RED";

    public static void main(String[] args) {
        System.out.println("RED_COLOUR = " + RED_COLOUR);

        System.out.println(RainbowColours.BLUE.toString());

        System.out.println(Countries.GERMANY.getName());
        System.out.println(Countries.GERMANY_ALT.getName());

        OrderProcessor orderProcessor = new OrderProcessor(OrderStatus.DISPATCHED);

        orderProcessor.obtainCurrentOrderStatus();
        orderProcessor.printOrderMessage();

        Dog poodle = new Dog(DogSize.SMALL);

        poodle.setHungerLevel(100);

        poodle.hungry();

        Dog labrador = new Dog(DogSize.LARGE);
        labrador.bark();

        Address address = new Address("123", "Manchester", "SK16 5RE");
        Person person = new Person("Jill", "Jones", 34, address) {
            @Override
            public void haveLunch() {
                System.out.println("twelve");
            }
        };
        System.out.println(person.toString());

        Student student = new Student("Jack", "Smith", 32, address);
        student.setUniversityName("Man Met");
        System.out.println(student.toString());

        Student anotherStudent = new Student("Sania", "NoIdea", 12, address);

        Lights lights = new Lights();
        Fan pelonisFan = new Fan();

        List<Controls> controlsList = Arrays.asList(lights, pelonisFan);

        ArrayList<Controls> controls = new ArrayList<>();
        controls.add(lights);
        controls.add(pelonisFan);

        System.out.println(controlsList);

        for (Controls controllableItem : controls) {
            controllableItem.switchOn();
            controllableItem.switchOff();
        }
    }

    Tesla newestcar = new Tesla("red", 7, TransmissionType.AUTO, 8D, "toyota");
}
