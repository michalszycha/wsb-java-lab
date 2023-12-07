package com.example.evaluation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private final String firstName;
    private final String lastName;

    private final List<Integer> grades = new ArrayList<>();
    private final Map<String, Double> finalGrades = new HashMap<>();
    private final Map<String, List<Integer>> grades2 = new HashMap<>();

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

    public void addGrades(String subject, List<Integer> grades) {
        if (!grades2.containsKey(subject))
            grades2.put(subject, new ArrayList<>());
        grades2.get(subject).addAll(grades);
    }

    public List<Integer> getGrades(String subject) {
        return grades2.get(subject);
    }

    public double getFinalGrade(String subject) {
        return getFinalGradeFromSubject(subject);
    }

    public Map<String, Double> getFinalGrades() {
        for (String subject: grades2.keySet()) {
            finalGrades.put(subject, getFinalGradeFromSubject(subject));
        }
        return finalGrades;
    }

    private double getFinalGradeFromSubject(String subject) {
        return (double) grades2.get(subject).stream().mapToInt(Integer::intValue).sum() / (double) grades2.get(subject).size();
    }
}
