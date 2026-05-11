package ch9;
class Vehicle {
    public String toString() {
        return "Vehicle::toString()";
    }
}

class Car extends Vehicle{}
class Boat extends Vehicle{}
class Sedan extends Car{}
class Truck extends Car{}
class Bus extends Vehicle{}
class Convertible extends Car {}

public class TestVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.toString());

        Car car = new Car();
        System.out.println(car.toString());
        Sedan sedan = new Sedan();
        System.out.println(sedan.toString());

        System.out.println(new TestVehicle().toString());
    }
}