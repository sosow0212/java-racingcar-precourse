package racingcar.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputParser {
    public int tryCountParser(String input) {
        return Integer.parseInt(input);
    }

    public List<String> carsParser(String input) {
        String[] cars = input.split(",");
        List<String> result = Arrays.stream(cars).collect(Collectors.toList());
        return result;
    }
}
