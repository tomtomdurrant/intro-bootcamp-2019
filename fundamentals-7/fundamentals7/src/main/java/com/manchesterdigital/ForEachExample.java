package com.manchesterdigital;

import java.util.ArrayList;

public class ForEachExample {
    public static void main(String[] args) {
        /*
        * for (datatype instance : collection ) {
        * }
        * */
        ArrayList<String> students = new ArrayList<>();
        students.add("Callum");
        students.add("Andrew");
        students.add("Trump");

        for (String student :
                students) {
            System.out.println("student = " + student);
        }
    }
}
