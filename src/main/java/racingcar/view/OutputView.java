package racingcar.view;

import java.util.List;
import java.util.Map;

public class OutputView {

    public void printRequestName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printRequestTryCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printResultStart() {
        System.out.println("실행 결과");
    }

    public void printResultTurn(Map<String, Integer> result) {
        for (String key : result.keySet()) {
            String bar = "";
            for (int i = 0; i < result.get(key); i++) {
                bar += "-";
            }
            System.out.println(key + " : " + bar);
        }
        System.out.println();
    }

    public void printWinner(List<String> winner) {
        StringBuilder winnerNames = new StringBuilder();
        for (int i = 0; i < winner.size(); i++) {
            winnerNames.append(winner.get(i) + ", ");
        }

        String result = winnerNames.substring(0, winnerNames.length() - 2);
        System.out.println("최종 우승자 : " + result);
    }
}
