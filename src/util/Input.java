package util;

import java.util.ArrayList;
import java.util.List;

public class Input {
    public static String validName() {
        return null;
    }

    public static Integer validGrade() {
        return 0;
    }

    public static String convertListIntToStr(List<Integer> list) {
        String str = "";
        for (Integer n : list) {
            str += n + ";";
        }
        return str;
    }

    public static List<Integer> convertStrToListInt(String str) {
        List<Integer> nums = new ArrayList<>();
        for (String s : str.split(";")) {
            nums.add(Integer.parseInt(s));
        }
        return nums;
    }


}
