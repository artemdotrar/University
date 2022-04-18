package repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {

    public static List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(List<String> lines, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
