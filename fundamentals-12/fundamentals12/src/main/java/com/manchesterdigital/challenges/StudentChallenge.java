package com.manchesterdigital.challenges;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentChallenge {
    public static void main(String[] args) {
        Student student1 = new Student("John", "French", 80);
        Student student2 = new Student("Adam", "German", 80);
        Student student3 = new Student("Steve", "English", 80);
        Student student4 = new Student("Barry", "French", 40);

        List<Student> studentList = List.of(student1, student2, student3, student4);

        List<Student> frenchStudents = studentList.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase("French"))
                .filter(student -> student.getScore() > 50)
                .filter(student -> student.getName().startsWith("A") ||
                        student.getName().startsWith("S"))
                .collect(Collectors.toList());

        List<Student> englishStudents = studentList.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase("English"))
                .filter(student -> student.getScore() > 50)
                .filter(student -> student.getName().startsWith("A") ||
                        student.getName().startsWith("S"))
                .collect(Collectors.toList());

        List<Student> germanStudents = studentList.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase("German"))
                .filter(student -> student.getScore() > 50)
                .filter(student -> student.getName().startsWith("A") ||
                        student.getName().startsWith("S"))
                .collect(Collectors.toList());

        System.out.println("germanStudents = " + germanStudents);
        System.out.println("englishStudents = " + englishStudents);
        System.out.println("frenchStudents = " + frenchStudents);
    }

    //You could then refactor the filters to another method which is then called on each list.
    private static List<Student> extractStudent(List<Student> students, String subject, Integer minScore) {
        return students.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase(subject))
                .filter(student -> student.getScore() > minScore)
                .filter(student -> student.getName().startsWith("A") ||
                        student.getName().startsWith("S"))
                .collect(Collectors.toList());
    }

    

    private static Predicate<Student> studentFilter(String subject, Integer minScore) {
        return student -> student.getSubject().equalsIgnoreCase(subject) &&
                student.getScore() > minScore &&
                (student.getName().startsWith("A") ||
                        student.getName().startsWith("S"));
    }
    private static List<Student> extractStudentUsingPredicate(List<Student> students, String subject, Integer minScore) {
        return students.stream()
                .filter(studentFilter(subject, minScore))
                .collect(Collectors.toList());
    }
}


