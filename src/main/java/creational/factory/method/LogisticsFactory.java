package creational.factory.method;

public class LogisticsFactory {

    public static Vehicle create(Vehicles vehicles) {
        switch (vehicles) {
            case CAR:
                return new Car();
            case BOAT:
                return new Boat();
            case AIRPLANE:
                return new Airplane();
            case TRAIN:
                return new Train();
        }

        throw new IllegalArgumentException();
    }
}
