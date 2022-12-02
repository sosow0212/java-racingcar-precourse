package racingcar;

import racingcar.util.RandomNumberGenerator;

public class RandomNumberMakerTest implements RandomNumberGenerator {
    @Override
    public int move() {
        return 5;
    }
}
