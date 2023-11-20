package exercise2;

public class Car extends AbstractVehicle{
    private  Integer countOfDoor;
    public Car(String make, Integer year,Integer countOfDoor) {
        super(make, year);
        this.countOfDoor = countOfDoor;
    }




    @Override
    void start() {
        System.out.println("Car is starting");

    }

    @Override
    public String toString() {
        return "Car made:" + getMake() + " Yaer:" + getYear() + "Count of doors:" + countOfDoor;
    }

    @Override
    void stop() {
        System.out.println("Car is stopping");

    }
}
