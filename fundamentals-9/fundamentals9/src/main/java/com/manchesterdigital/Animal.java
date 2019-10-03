package com.manchesterdigital;

public abstract class Animal {
    private Integer age;
    private String gender;
    private Integer weightInLbs;

    public Animal(Integer age, String gender, Integer weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public abstract void move();

}
