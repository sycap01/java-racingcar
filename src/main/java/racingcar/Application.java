package racingcar;

import java.util.List;
import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String nameOfCar = scanner.nextLine();

        System.out.println("시도할 횟수는 몇 회인가요?");
        int round = scanner.nextInt();

        System.out.println("실행 결과");

        String[] carList = nameOfCar.split(",");
        CarFactory carFactory = new CarFactory();
        List<Car> carArrayList = carFactory.createCar(carList);
        RacingGame racingGame = new RacingGame(carArrayList, round);
        racingGame.runWholeRound();
        List<String> winner = racingGame.getWinner();
        System.out.println("최종 우승자: " + winner);
    }


}
