package creational.singleton;

public class SingletonLazy {

    private static SingletonLazy SINGLETON;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new SingletonLazy();
        }
        return SINGLETON;
    }
}
