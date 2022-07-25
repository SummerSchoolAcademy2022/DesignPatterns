package creational.singleton;

public class Main {
    public static void main(String[] args) {

        var singletonLazy1 = SingletonLazy.getInstance();
        var singletonLazy2 = SingletonLazy.getInstance();

        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);

        //synchronized
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                var singleton1 = SingletonSynchronized2.getInstance();
                System.out.println(singleton1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                var singleton2 = SingletonSynchronized2.getInstance();
                System.out.println(singleton2);
            }
        });

        t1.start();
        t2.start();

    }
}
