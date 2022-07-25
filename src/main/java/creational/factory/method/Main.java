package creational.factory.method;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        var vehicle1 = LogisticsFactory.create(Vehicles.CAR);
        var vehicle2 = LogisticsFactory.create(Vehicles.BOAT);
        var vehicle3 = LogisticsFactory.create(Vehicles.AIRPLANE);
        var vehicle4 = LogisticsFactory.create(Vehicles.TRAIN);
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);
        System.out.println(vehicle4);

        var localDateTime = LocalDateTime.now();
        Path path = Paths.get("./");
        System.out.println(path.getClass());
    }
}
