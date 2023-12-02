package tst;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import src.Day1;

import static org.junit.Assert.assertEquals;

public class Day1Test {
    //1abc2
    //pqr3stu8vwx
    //a1b2c3d4e5f
    //treb7uchet
    @Test
    public void testSumOfCalibrationValues() throws IOException {
        List<String> input = new ArrayList<>(
                Arrays.asList("1abc2", "pqr3stu8vwx", "a1b2c3d4e5f", "treb7uchet"));

        String fileName = "extras/input.txt";

        List<String> input2;
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            input2 = lines.collect(Collectors.toList());
        }

        assertEquals(142, Day1.sumOfCalibrationValues(input));
        System.out.println(Day1.sumOfCalibrationValues(input2));
    }
}
