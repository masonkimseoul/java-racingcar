package racingcar.domain;

public class Car {
    private String name;
    private int count;

    public Car(final String name) {
        this.name = name;
        this.count = 0;
    }

    public void move(final int randomNumber) {
        if (randomNumber > 3 ) {
            this.count += 1;
        }
    }
}
