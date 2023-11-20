package exercise2;

import java.time.Year;

public abstract class AbstractVehicle {
    private String make;
    private  Integer year;

    public String getMake() {
        return make;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle is made:" + make +"Year:" + year;
    }

    public AbstractVehicle(String make, Integer year) {
        this.make = make;
        this.year = year;
    }

    abstract void start();
    abstract  void stop();

}
