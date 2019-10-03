package com.manchesterdigital;

public class Student extends Person {
    private String universityName;

    public Student(String firstName, String lastName, Integer age, Address address) {
        super(firstName, lastName, age, address);
    }

    @Override
    public void haveLunch() {
        System.out.println("Has lunch at 12");
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {

        StringBuilder out = new StringBuilder();

        out.append("University Name: ");
        out.append(universityName);
        out.append("\n");
        out.append("Person: ");
        out.append(getFirstName());

        return out.toString();
    }
}
