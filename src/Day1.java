package src;

import java.util.ArrayList;
import java.util.List;

public class Day1 {
    public static int sumOfCalibrationValues(List<String> input) {
        List<Integer> values = new ArrayList<>();
        int sum = 0;

        for (String str : input) {
            int start = -1, end = -1;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (checkIfNum(ch)) {
                    if (start == -1) {
                        start = Character.getNumericValue(ch);
                    } else {
                        end = ch - '0';
                    }
                }
            }
            if (end == - 1) { // implies only one number in the string
                end = start;
            }
            values.add(10 * start + end);
        }
        for (Integer value : values) {
            sum += value;
        }
        System.out.println(sum);
        return sum;
    }

    private static boolean checkIfNum(char ch) {
        for (int i = 0; i <= 9; i++) {
            if (i == Character.getNumericValue(ch)) {
                return true;
            }
        }
        return false;
    }
}
