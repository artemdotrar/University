package entity;

import util.Input;

import java.util.List;

public class Student implements SavedInFile {
    private int id;
    private String fullName;
    private int idGroup;
    private List<Integer> rating;

    //конструктор для чтения из файла
    public Student(String line) {
        String[] parameters = line.split(",");
        this.id = Integer.parseInt(parameters[0]);
        this.fullName = parameters[1];
        this.idGroup = Integer.parseInt(parameters[2]);
        this.rating = Input.convertStrToListInt(parameters[3]);
    }

    @Override
    public String toString() {
        return "Студент №" + id + " " + fullName + ", группа №" + idGroup + ", \tОценки:" + rating;
    }

    //перевод в строку для записи в файл
    @Override
    public String convertToLine() {
        return id + "," + fullName + "," + idGroup + "," + Input.convertListIntToStr(rating);
    }

    public int getRating() {
        int sum = 0;
        for (int n : rating) {
            sum += n;
        }
        return sum / rating.size();
    }


}
