public class ElectricCar implements Car {

    private final String carType;

    public ElectricCar(String carType) {
        this.carType = carType;
    }
    @Override
    public void speedUp() {
        System.out.println("Speed the electric car Up!");
    }
    @Override
    public void slowDown() {
        System.out.println("Slowing the electric car down!");
    }
}