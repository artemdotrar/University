package repository;

import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDatabase implements Database {
    public List<Student> db = new ArrayList<>();
    private final static String FILE_PATH = "student.txt";

    public void loadDB() {
        List<String> lines = FileLoader.readFile(FILE_PATH);
        db = lines.stream()
                .map(line -> new Student(line))
                .collect(Collectors.toList());
//
//        lines.stream()
//                .forEach(line -> db.add(new Student(line)));

    }

    public void saveDB() {
        List<String> lines = db.stream()
                .map(student -> student.convertToLine())
                .collect(Collectors.toList());
        FileLoader.writeFile(lines, FILE_PATH);
    }

    public boolean insert(Student student) {
        db.add(student);
        saveDB();
        return false;
    }
}
