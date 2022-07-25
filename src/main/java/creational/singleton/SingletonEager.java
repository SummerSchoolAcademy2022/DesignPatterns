package creational.singleton;

public class SingletonEager {

    private static SingletonEager SINGLETON = new SingletonEager();

    private SingletonEager() {

    }

    public static SingletonEager getInstance() {
        return SINGLETON;
    }
}
