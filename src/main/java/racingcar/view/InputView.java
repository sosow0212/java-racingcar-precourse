package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.exception.GameException;
import racingcar.util.InputParser;

public class InputView {
    private final GameException gameException = new GameException();
    private final InputParser inputParser = new InputParser();

    public List<String> inputCars() {
        try {
            String input = Console.readLine();
            gameException.validateCars(input);
            return inputParser.carsParser(input);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return inputCars();
        }
    }

    public int inputTryCount() {
        try {
            String input = Console.readLine();
            gameException.validateTryCount(input);
            return inputParser.tryCountParser(input);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return inputTryCount();
        }
    }
}
