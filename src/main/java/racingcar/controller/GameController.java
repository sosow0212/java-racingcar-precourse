package racingcar.controller;

import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.util.RandomNumberGenerator;
import racingcar.util.RandomNumberMaker;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberMaker();

    public void run() {
        Cars cars = setCars();
        int tryCount = setTryCount();
        gameStart(tryCount, cars);
    }

    public void gameStart(int tryCount, Cars cars) {
        outputView.printResultStart();
        for(int i=0; i<tryCount; i++) {
            cars.moveCar(new RandomNumberMaker());
            outputView.printResultTurn(cars.getResult());
        }
        outputView.printWinner(cars.getWinner());
    }

    public int setTryCount() {
        outputView.printRequestTryCount();
        int tryCount = inputView.inputTryCount();
        return tryCount;
    }


    public Cars setCars() {
        outputView.printRequestName();
        List<String> carNames = inputView.inputCars();
        List<Car> carList = carNames.stream().map(name -> new Car(name)).collect(Collectors.toList());
        Cars cars = new Cars(carList);
        return cars;
    }
}
