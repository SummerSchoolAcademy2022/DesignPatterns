package creational.builder;

public class HouseWithoutBuilder {

    private int walls;
    private int doors;
    private int windows;
    private boolean roof;
    private boolean garage;

    public HouseWithoutBuilder(int walls) {
        this.walls = walls;
    }

    public HouseWithoutBuilder(int walls, int doors) {
        this.walls = walls;
        this.doors = doors;
    }

    public HouseWithoutBuilder(int walls, int doors, int windows) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
    }

    public HouseWithoutBuilder(int walls, int doors, int windows, boolean roof) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
    }

    public HouseWithoutBuilder(int walls, int doors, int windows, boolean roof, boolean garage) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.roof = roof;
        this.garage = garage;
    }
}
