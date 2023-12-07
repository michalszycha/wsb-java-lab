package com.example.evaluation;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private final String firstName;
    private final String lastName;

    private final List<String> subjects = new ArrayList<>();

    public Teacher(String firstName, String lastName) {
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
}
