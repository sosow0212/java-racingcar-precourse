package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.util.InputParser;

public class InputView {
    private final InputParser inputParser = new InputParser();

    public List<String> inputCars() {
        try {
            String input = Console.readLine();
            return inputParser.carsParser(input);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return inputCars();
        }
    }

    public int inputTryCount() {
        try {
            String input = Console.readLine();
            // exception
            return inputParser.tryCountParser(input);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return inputTryCount();
        }
    }
}
