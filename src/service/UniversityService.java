package service;

import entity.Student;
import repository.StudentDatabase;

import java.util.List;

public class UniversityService {
    private StudentDatabase studentDB = new StudentDatabase();

    void loadAllDatabases(){
        studentDB.loadDB();
    }

    public List<String> getSortedStudentByRating () {

    }
}
