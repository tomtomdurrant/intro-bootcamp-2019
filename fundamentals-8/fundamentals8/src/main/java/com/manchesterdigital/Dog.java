package com.manchesterdigital;

public class Dog {
    private String breed;
    private Integer age;
    private String eyeColour;
    private Integer tailLength;
    private Integer aggressionLevel;
    private DogSize dogSize;
    private Integer hungerLevel;

    public Dog(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    public void bark(){
        System.out.println(dogSize.getNoise());
    }

    public void hungry() {
        if (hungerLevel > 10) {
            for (int i = 0; i < 10; i++) {
                bark();
            }
            System.out.println("GIMME FOOD!! " + dogSize.getNoise());
        } else {
            System.out.println("I'm stuffed");
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setTailLength(Integer tailLength) {
        this.tailLength = tailLength;
    }

    public void setAggressionLevel(Integer aggressionLevel) {
        this.aggressionLevel = aggressionLevel;
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
}
