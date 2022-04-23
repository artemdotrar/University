package controller;

import util.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainTemp {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                list.add(r.nextInt(7) + 3);
            }
            System.out.println(Input.convertListIntToStr(list));
        }
    }
}
