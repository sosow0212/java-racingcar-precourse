package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private final int gameTryCount;
    private final List<Car> cars;

    public Game(int gameTryCount, List<Car> cars) {
        this.gameTryCount = gameTryCount;
        this.cars = cars;
    }

    public void run() {
        cars.forEach(car -> car.move());
    }
}
