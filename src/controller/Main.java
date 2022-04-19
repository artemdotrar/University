package controller;

import entity.Student;
import repository.Database;
import repository.StudentDatabase;

public class Main {
    public static void main(String[] args) {
        StudentDatabase sb = new StudentDatabase();
        sb.loadDB();
      // sb.insert(new Student("Артем,1,2;2"));
       // sb.saveDB();
        for(Student s : sb.db) {
            System.out.println(s);
        }
    }
}
