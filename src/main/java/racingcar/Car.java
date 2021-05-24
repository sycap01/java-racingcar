package racingcar;

public class Car {
    private static final int NAME_VALID_NUMBER = 5;
    private String carName;
    private int location;

    public Car(String carName) {
        this(carName, 0);
    }

    public Car(String carName, int location) {
        if (carName.length() > NAME_VALID_NUMBER) {
            throw new IllegalArgumentException("5자이하로만 입력해주세요");
        }
        this.carName = carName;
        this.location = location;
    }

    public void run(boolean condition) {
        if (condition) {
            this.location++;
        }
    }

    public int getLocation() {
        return location;
    }

    public String getCarName() {
        return carName;
    }
}
