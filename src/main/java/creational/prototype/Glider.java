package creational.prototype;

public class Glider extends Airplane {

    public boolean hasEngine;

    public Glider() {

    }

    public Glider(Glider glider) {
        super(glider);
        if (glider != null) {
            this.hasEngine = glider.hasEngine;
        }
    }

    @Override
    public Airplane clone() {
        return new Glider(this);
    }

    @Override
    public String toString() {
        return "Glider{" +
                "seats=" + seats +
                ", hasEngine=" + hasEngine +
                '}';
    }
}
