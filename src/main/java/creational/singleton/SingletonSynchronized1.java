package creational.singleton;

import java.time.LocalDateTime;

public class SingletonSynchronized1 {

    private static SingletonSynchronized1 SINGLETON;

    private SingletonSynchronized1() {

    }

    public static synchronized SingletonSynchronized1 getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new SingletonSynchronized1();
        }
        System.out.println(LocalDateTime.now());
        return SINGLETON;
    }
}
