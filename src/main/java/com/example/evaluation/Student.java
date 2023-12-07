package com.example.evaluation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;

    private final List<Integer> grades = new ArrayList<>();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNameName() {
        return lastName;
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void addGrades(List<Integer> grades) {
        this.grades.addAll(grades);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getMeanGrades() {
        if(grades.isEmpty())
            return 0;
        int sum = grades.stream().mapToInt(Integer::intValue).sum();
        return (double) sum / (double) grades.size();
    }
}
