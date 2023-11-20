package exercise2;

public class Bus extends  AbstractVehicle{
    public Bus(String make, Integer year) {
        super(make, year);
    }

    @Override
    void start() {
        System.out.println("Bus is starting");
    }

    @Override
    void stop() {
        System.out.println("Bas is stopping");

    }
}
