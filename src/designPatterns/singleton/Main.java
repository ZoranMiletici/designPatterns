package designPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); // false
        System.out.println(singleton2 == singleton3); // false

        System.out.println(Singleton.nrOfInstance);
    }
}
