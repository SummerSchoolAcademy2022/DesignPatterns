package creational.factory.abstrac;

public class ChairFactory implements FurnitureFactory {
    @Override
    public Furniture create() {
        return new Chair();
    }
}
