package carRacing.dto;

public class UserInput {
    private final int numberOfCars;
    private final int numberOfRace;

    public UserInput(int numberOfCars, int numberOfRace) {
        this.numberOfCars = numberOfCars;
        this.numberOfRace = numberOfRace;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public int getNumberOfRace() {
        return numberOfRace;
    }
}
