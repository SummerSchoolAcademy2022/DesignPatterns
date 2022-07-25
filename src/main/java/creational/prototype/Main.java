package creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Airbus airbus = new Airbus();
        airbus.seats = 200;
        airbus.engines = 4;

        Airbus anotherAirbus = (Airbus) airbus.clone();
        anotherAirbus.engines = 6;

        Glider glider = new Glider();
        glider.seats = 2;
        glider.hasEngine = false;

        Glider anotherGlider = (Glider) glider.clone();
        glider.hasEngine = true;

        System.out.println(airbus);
        System.out.println(anotherAirbus);
        System.out.println(glider);
        System.out.println(anotherGlider);

        System.out.println("List of copies");

        List<Airplane> airplanes = new ArrayList<>();

        airplanes.add(airbus);
        airplanes.add(anotherAirbus);
        airplanes.add(glider);
        airplanes.add(anotherGlider);

        List<Airplane> airplaneCopy = airplanes.stream()
                .map(Airplane::clone)
                .collect(Collectors.toList());

        for (int i = 0; i < airplanes.size(); i++) {
            System.out.println(airplanes.get(i));
            System.out.println(airplaneCopy.get(i));
            System.out.println(airplanes.get(i).equals(airplaneCopy.get(i)));
        }

    }
}
