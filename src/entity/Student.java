package entity;

import repository.SavedInFile;

import java.util.List;

public class Student implements SavedInFile {
    private String fullName;
    private int idGroup;
    private List<Integer> rating;


    //конструктор для чтения из файла
    public Student(String line) {
        String[] parameters = line.split(",");
    }


    //перевод в строку для записи в файл
    @Override
    public String convertToLine() {
        return fullName + "," + idGroup + "," + rating;
    }


}
