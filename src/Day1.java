package src;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day1 {
    private static final Map<String, String> map = Map.of("one", "1",
            "two", "2",
            "three", "3",
            "four", "4",
            "five", "5",
            "six", "6",
            "seven", "7",
            "eight", "8",
            "nine", "9"
    );

    public static int sumOfCalibrationValues(List<String> input) {
        int sum = 0;
        Pattern pattern = Pattern.compile("one|two|three|four|five|six|seven|eight|nine|\\d");

        for (String str : input) {
            Matcher matcher = pattern.matcher(str);
            String start = null, end = null;

            while(matcher.find()) {
                if (start == null) {
                    start = matcher.group();
                } else {
                    end = matcher.group();
                    matcher.region(matcher.start() + 1, str.length());
                }
            }

            if (end == null) { // implies only one number in the string
                end = start;
            }
            sum += Integer.parseInt(map.getOrDefault(start, start) + map.getOrDefault(end, end));
        }
        return sum;
    }
}
