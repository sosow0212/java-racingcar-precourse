package racingcar.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import racingcar.util.RandomNumberGenerator;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void moveCar(RandomNumberGenerator randomNumberGenerator) {
        cars.forEach(car -> car.move(randomNumberGenerator.move()));
    }

    public Map<String, Integer> getResult() {
        HashMap<String, Integer> result = new HashMap<>();
        cars.stream().map(i -> result.put(i.getName(), i.getPosition())).collect(Collectors.toList());
        return result;
    }

    public List<String> getWinner() {
        List<String> winner = cars.stream()
                .filter(i -> getMaxIndex() == i.getPosition())
                .map(i -> i.getName())
                .collect(Collectors.toList());
        return winner;
    }

    public int getMaxIndex() {
        return cars.stream().mapToInt(i -> i.getPosition()).max().orElse(0);
    }
}
