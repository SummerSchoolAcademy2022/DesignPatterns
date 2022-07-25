package creational.singleton;

public class SingletonSynchronized3 {

    private SingletonSynchronized3() {

    }

    private static final class SingletonHolder {
        private static final SingletonSynchronized3 SINGLETON = new SingletonSynchronized3();
    }

    public static SingletonSynchronized3 getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
