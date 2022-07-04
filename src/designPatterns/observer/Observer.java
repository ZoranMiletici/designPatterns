package designPatterns.observer;

public interface Observer {
    void subscribe(Subject subject);
    void unsubscribe(Subject subject);
    void update(String message);
}
