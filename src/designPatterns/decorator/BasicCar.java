package designPatterns.decorator;

public class BasicCar implements Car {
    @Override
    public void build() {
        System.out.println("Basic Car");
    }
}
