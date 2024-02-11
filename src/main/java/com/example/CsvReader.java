package com.example;

import com.example.evaluation.Student;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public List<Student> getStudentsFromCsv() {
        List<Student> students = new ArrayList<>();
        try {
            List<CSVRecord> studentRecords = parseStudentCsv();
            for (CSVRecord rec: studentRecords) {
                String firstName = rec.get("firstName");
                String lastName = rec.get("lastName");
                Student student = new Student(firstName, lastName);
                students.add(student);
            }
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
    private List<CSVRecord> parseStudentCsv() throws URISyntaxException, IOException {
        URL resource = getClass().getClassLoader().getResource("students.csv");
        Path path = Paths.get(resource.toURI());
        CSVFormat csvFormat = CSVFormat.DEFAULT.withFirstRecordAsHeader();
        CSVParser parser = CSVParser.parse(path, Charset.defaultCharset(), csvFormat);
        return parser.getRecords();
    }
}
