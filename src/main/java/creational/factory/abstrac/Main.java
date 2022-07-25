package creational.factory.abstrac;

public class Main {
    public static void main(String[] args) {

        var furnitureFactory1 = FurnitureFactory.create(FurnitureFactory.FurnitureType.TABLE);
        var furniture1 = furnitureFactory1.create();
        System.out.println(furniture1);

        var furnitureFactory2 = FurnitureFactory.create(FurnitureFactory.FurnitureType.CHAIR);
        var furniture2 = furnitureFactory2.create();
        System.out.println(furniture2);

        /*
        EntityManagerFactory emf = Persistence.createEntityManagerFactory();
        EntityManager em = emf.createEntityManager()
         */
    }
}
