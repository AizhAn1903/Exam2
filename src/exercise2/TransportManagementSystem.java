package exercise2;

public class TransportManagementSystem {
    public static void main(String[] args) {

        Car car = new Car("BMW",2020,4);
        car.start();
        car.stop();
        System.out.println(car.toString());

        Bike bike = new Bike("Honda",2012);
        bike.start();
        bike.stop();

        Bus bus = new Bus("Mersedes Bens",1996);
        bus.start();
        bus.stop();
    }
}
