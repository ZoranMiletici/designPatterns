package designPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        BasicCar basicCar = new BasicCar();
        basicCar.build();

        System.out.println("====");

        Car sportCar = new SportCarDecorator(basicCar);
        sportCar.build();

        System.out.println("=======");
        Car luxCar = new LuxCarDecorator(basicCar);
        luxCar.build();

        System.out.println("======");
        Car luxSportCar = new LuxCarDecorator(sportCar);
        luxSportCar.build();

        System.out.println("=========");
        Car sportLuxCar = new SportCarDecorator(luxCar);
        sportLuxCar.build();
    }
}
