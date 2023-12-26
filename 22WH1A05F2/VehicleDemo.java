public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        Car car = new Car();
        car.drive();
    }
}
class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car");
    }
}