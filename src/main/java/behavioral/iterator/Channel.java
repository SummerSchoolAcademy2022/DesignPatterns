package behavioral.iterator;

public class Channel {
    private String name;

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                '}';
    }
}
