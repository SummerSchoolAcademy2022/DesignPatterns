package creational.prototype;

public abstract class Airplane {
    public int seats;

    public Airplane() {

    }

    public Airplane(Airplane airplane) {
        if (airplane != null) {
            this.seats = airplane.seats;
        }
    }

    public abstract Airplane clone();
}
