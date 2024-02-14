package racingcar.view;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Cars;

public class OutputView {
    private static final String CAR_NAMES_INPUT_MSG = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String TRY_COUNT_INPUT_MSG = "시도할 회수는 몇회인가요?";
    private static final String RESULT_MSG = "실행 결과";
    private static final String POSITION_FORM = "%s : %s";
    private static final String TRACE = "-";
    private static final String WINNER_MSG = "%s가 최종 우승했습니다.";

    public void printCarPosition(Cars cars) {
        for(Car car : cars.getCars()) {
            String name = car.getName();
            String traces = makeTraces(car.getCount());
            System.out.println(String.format(POSITION_FORM, name, traces));
        }
        System.out.println();
    }

    private String makeTraces(int count) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {
            sb.append(TRACE);
        }
        return sb.toString();
    }

    public void printWinners(final List<Car> winners) {
        List<String> winnerNames = winners.stream().map(Car::getName).toList();
        String names = String.join(", ", winnerNames);
        System.out.println(String.format(WINNER_MSG, names));
    }

    public void printCarNamesInputMsg() {
        System.out.println(CAR_NAMES_INPUT_MSG);
    }

    public void printTryCountInputMsg() {
        System.out.println(TRY_COUNT_INPUT_MSG);
    }

    public void printResultMsg() {
        System.out.println(RESULT_MSG);
    }
}
