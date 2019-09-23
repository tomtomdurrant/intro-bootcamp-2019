package com.manchesterdigital;

public class Student {
    public static final String CLASS_NAME = "Bootcamp";

//    this is an example of an instance variable
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    } //end of class

    public void printDetails() {
        System.out.println("Student's name is " + studentName + " Class is " + CLASS_NAME);
    }

    public static void main(String[] args) {
        Student student = new Student("Tom");
        student.printDetails();
    }
}
