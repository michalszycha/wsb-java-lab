package com.example;

import com.example.evaluation.Student;
import com.example.evaluation.Teacher;

public class GradeEvaluator {

    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski");
        Teacher teacher = new Teacher("Pawel", "Nowak");

        System.out.println(student.getFullName());
        System.out.println(teacher.getFullName());
    }

}