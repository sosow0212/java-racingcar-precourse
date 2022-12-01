package racingcar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public Map<String, Integer> getResult() {
        HashMap<String, Integer> result = new HashMap<>();
        cars.stream().map(i -> result.put(i.getName(), i.getPosition())).collect(Collectors.toList());
        return result;
    }
}
