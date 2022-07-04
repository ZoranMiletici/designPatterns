package designPatterns.observer;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Mihai");
        User user2 = new User("Ana");
        User user3 = new User("Ionut");

        Baeldung baeldung = new Baeldung();

        user1.subscribe(baeldung);
        user2.subscribe(baeldung);
        user3.subscribe(baeldung);

        baeldung.setMessage("Am adaugat un articol despre Design Patterns");
        baeldung.notifyObservers();

        System.out.println("=====");
        user3.unsubscribe(baeldung);

        baeldung.setMessage("Am adaugat un nou articol despre Clean Code");
        baeldung.notifyObservers();

    }
}
