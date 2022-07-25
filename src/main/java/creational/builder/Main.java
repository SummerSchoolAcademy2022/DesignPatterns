package creational.builder;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        var houseWithoutBuilder = new HouseWithoutBuilder(4, 3);
        System.out.println(houseWithoutBuilder);

        var house1 = new House.Builder()
                .walls(4)
                .doors(2)
                .windows(5)
                .roof(true)
                .garage(false)
                .build();
        System.out.println(house1);

        var house2 = new House.Builder()
                .walls(4)
                .build();
        System.out.println(house2);

        var house3 = House.builder()
                .walls(4)
                .doors(1)
                .build();
        System.out.println(house3);

        var houseLombok = HouseLombok.builder()
                .walls(4)
                .roof(true)
                .build();
        System.out.println(houseLombok);

        var locale = new Locale.Builder()
                .setLanguage("en")
                .build();

        /*
        UserDetails udt = User.withUsername()
                              .password()
                              .build();
         */
    }
}
