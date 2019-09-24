package com.manchesterdigital;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }




    public static void main(String[] args) {
        Student englishStudent = new Student("Amy");
        System.out.println(englishStudent.getName());

        Student frenchStudent = new Student("Duncan", 23);
        System.out.println(frenchStudent.getName() + " " + frenchStudent.getAge());

        System.out.println(englishStudent.toString());

    }


}
