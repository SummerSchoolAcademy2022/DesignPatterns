package creational.builder;

public class House {

    private int walls;
    private int doors;
    private int windows;
    private boolean roof;
    private boolean garage;

    public static class Builder {
        private House house = new House();

        public Builder walls(int walls) {
            house.walls = walls;
            return this;
        }

        public Builder doors(int doors) {
            house.doors = doors;
            return this;
        }

        public Builder windows(int windows) {
            house.windows = windows;
            return this;
        }

        public Builder roof(boolean roof) {
            house.roof = roof;
            return this;
        }

        public Builder garage(boolean garage) {
            house.garage = garage;
            return this;
        }

        public House build() {
            return house;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", windows=" + windows +
                ", roof=" + roof +
                ", garage=" + garage +
                '}';
    }
}
