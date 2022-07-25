package creational.prototype;

public class Airbus extends Airplane {
    public int engines;

    public Airbus() {

    }

    public Airbus(Airbus airbus) {
        super(airbus);
        if (airbus != null) {
            this.engines = airbus.engines;
        }
    }
    @Override
    public Airplane clone() {
        return new Airbus(this);
    }

    @Override
    public String toString() {
        return "Airbus{" +
                "engines=" + engines +
                ", seats=" + seats +
                '}';
    }
}
