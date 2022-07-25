package creational.factory.abstrac;

public class TableFactory implements FurnitureFactory {
    @Override
    public Furniture create() {
        return new Table();
    }
}
