package creational.factory.abstrac;

public interface FurnitureFactory {

    Furniture create();

    static FurnitureFactory create(FurnitureType furnitureType) {
        switch (furnitureType) {
            case CHAIR:
                return new ChairFactory();
            case TABLE:
                return new TableFactory();
        }
        throw new IllegalArgumentException();
    }

    enum FurnitureType {
        CHAIR, TABLE;
    }
}
