package creational.singleton;

import java.time.LocalDateTime;

public class SingletonSynchronized2 {

    private static SingletonSynchronized2 SINGLETON;

    private SingletonSynchronized2() {

    }

    public static SingletonSynchronized2 getInstance() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (SINGLETON == null) {
            synchronized (SingletonSynchronized2.class) {
                if (SINGLETON == null) {
                    SINGLETON = new SingletonSynchronized2();
                }
            }
        }
        System.out.println(LocalDateTime.now());
        return SINGLETON;
    }
}
