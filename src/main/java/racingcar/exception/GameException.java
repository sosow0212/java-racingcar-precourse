package racingcar.exception;

public class GameException {
    private final static String ERROR = "[ERROR] ";
    private final static int LENGTH_OF_CAR = 5;

    public void validateCars(String input) {
        String[] cars = input.split(",");
        for (String car : cars) {
            validateLengthOfName(car);
        }
    }

    private void validateLengthOfName(String car) {
        if (car.length() > LENGTH_OF_CAR) {
            exception("5자 미만");
        }
    }

    public void validateTryCount(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                exception("숫자만 입력하세요.");
            }
        }
    }

    public void exception(String message) {
        throw new IllegalArgumentException(ERROR + message);
    }
}
