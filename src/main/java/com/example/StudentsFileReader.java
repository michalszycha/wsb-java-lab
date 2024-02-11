package com.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class StudentsFileReader {

    public void readFile() {
        try {
            //Path path = Paths.get("students.csv");
            URL resource = getClass().getClassLoader().getResource("students.csv");
            Path path = Paths.get(resource.toURI());
            List<String> lines = Files.readAllLines(path);
            System.out.println("===============");
            System.out.println("Read file START:");
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("Read file END:");
            System.out.println("===============");
        } catch (IOException | URISyntaxException e) {
            System.out.println("Can't read file");
        }
    }
}
