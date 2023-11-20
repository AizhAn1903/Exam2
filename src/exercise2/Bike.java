package exercise2;

public class Bike extends AbstractVehicle{

    public Bike(String make, Integer year) {
        super(make, year);
    }

    @Override
    void start() {
        System.out.println("Bike is starting");

    }

    @Override
    void stop() {
        System.out.println("Bike is stopping");

    }
}
