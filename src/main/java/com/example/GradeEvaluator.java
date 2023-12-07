package com.example;

import com.example.evaluation.Student;
import com.example.evaluation.Teacher;

import java.util.List;

public class GradeEvaluator {

    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski");
        Teacher teacher = new Teacher("Pawel", "Nowak");

        System.out.println(student.getFullName());
        System.out.println(teacher.getFullName());

        student.addGrade(4);
        student.addGrade(4);
        student.addGrade(4);
        student.addGrades(List.of(4, 4, 3));

        System.out.println(student.getGrades());
        System.out.println(student.getMeanGrades());

        student.addGrades("maths", List.of(5, 5, 6));
        student.addGrades("english", List.of(3, 3, 4));
        student.addGrades("geography", List.of(2, 2, 4, 3, 3, 2));
        System.out.println(student.getGrades("maths"));
        System.out.println(student.getFinalGrade("english"));
        System.out.println(student.getFinalGrades());
    }

}