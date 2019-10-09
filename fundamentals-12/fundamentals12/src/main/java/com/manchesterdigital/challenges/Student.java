package com.manchesterdigital.challenges;

public class Student {
    private final String name;
    private final String subject;
    private final Integer score;

    public Student(String name, String subject, Integer score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentsClass{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", score=" + score +
                '}';
    }
}
