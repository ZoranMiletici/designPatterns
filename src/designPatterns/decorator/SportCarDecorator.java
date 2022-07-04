package designPatterns.decorator;

public class SportCarDecorator extends CarDecorator {
    public SportCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void build() {
        super.build();
        System.out.println("Adding sport features");
    }
}
